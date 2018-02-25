package txc.xxy.ssm.shiro.ext.token.impl;

import com.n22.cs.comp.common.ApplicationContextUtil;
import com.n22.cs.comp.shiro.exceprion.SysManageException;
import txc.xxy.ssm.shiro.ext.token.CustParentToken;
import txc.xyz.base.mapper.BaseUserMapper;
import txc.xyz.base.model.BaseUser;
import txc.xyz.base.model.BaseUserExample;

import java.util.List;

/**
 * @author: txc
 * @date: 18-2-24 下午5:15
 */
public class WxMpLoginVo extends CustParentToken {

    public static String err_code_not_related = "not_related"; //未关联用户错误码

    private static final long serialVersionUID = 470768717687119331L;

    private String loginIp;// 登录时的ip
    private String openid;// 微信公众号openid


    // 依赖对象
    private BaseUserMapper baseUserMapper;

    public WxMpLoginVo() {
        baseUserMapper = ApplicationContextUtil.getBean(BaseUserMapper.class);
    }

    public WxMpLoginVo(String openid, String loginIp) {
        baseUserMapper = ApplicationContextUtil.getBean(BaseUserMapper.class);
        this.openid = openid;
        this.loginIp = loginIp;
    }



    @Override
    public BaseUser doLogin() throws SysManageException {
        BaseUserExample baseUserExample = new BaseUserExample();
        txc.xyz.base.model.BaseUserExample.Criteria criteria= baseUserExample.createCriteria();
        criteria.andOpenIdEqualTo(this.openid);
        List<BaseUser> userList = baseUserMapper.selectByExampleWithBLOBs(baseUserExample);
        if(userList == null || userList.isEmpty()){
            throw new SysManageException(WxMpLoginVo.err_code_not_related,"该用户未关联账户");
        }
        if(userList.size() > 1){
            throw new SysManageException("多个账号关联该用户");
        }
        return userList.get(0);
    }

    @Override
    public String loginTypeDes() {
        return "微信公众号登录";
    }
}
