/**
 * @Title: UserBizImpl.java
 * @Package txc.xxy.ssm.biz.impl
 * @author Txc
 * @date 2017年4月27日 下午2:07:24
 */

package txc.xxy.ssm.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import txc.xxy.ssm.biz.UserBiz;
import txc.xyz.base.mapper.BaseUserMapper;
import txc.xyz.base.model.BaseUser;

/**
  *
  * @ClassName: UserBizImpl
  * @author Txc
  * @date 2017年4月27日 下午2:07:24
  */
@Service
public class UserBizImpl implements UserBiz{

	@Resource
	BaseUserMapper userMapper;
	
	@Override
	public void test() {
		BaseUser user = userMapper.selectByPrimaryKey(31L);
		System.out.println(user.toString());
	}

}
