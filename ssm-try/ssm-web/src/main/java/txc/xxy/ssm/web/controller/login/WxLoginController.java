package txc.xxy.ssm.web.controller.login;

import com.n22.cs.comp.common.IPUtil;
import com.n22.cs.comp.shiro.CustAuthenticationException;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import txc.xxy.ssm.shiro.ext.token.impl.WxMpLoginVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: txc
 * @date: 18-2-24 下午2:50
 */
@Controller
public class WxLoginController {

    @Autowired
    private WxMpService wxMpService;

    @RequestMapping("m/wx/{scope}/login.htm")
    public void login(HttpServletRequest request, HttpServletResponse response, @PathVariable String scope) throws Exception {
        String url = "http://txc.nat300.top/ssm-web/m/wx/{0}/loginCallback";
        String oAuth2Scope =  WxConsts.OAuth2Scope.SNSAPI_BASE;
        if(WxConsts.OAuth2Scope.SNSAPI_USERINFO.equals(scope)){
            oAuth2Scope =  WxConsts.OAuth2Scope.SNSAPI_USERINFO;
        }
        url = url.replace("{0}",oAuth2Scope);
        String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, oAuth2Scope, "123");

        response.sendRedirect(redirectUrl);
    }


    // base-登录回调
    @RequestMapping("m/wx/snsapi_base/loginCallback")
    public void baseLoginCallback(String code, HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);

        //微信登录
        this.shiroLogin(wxMpOAuth2AccessToken, request, response);

        //登录成功绑定头像(已经在登录中处理了LoginVO.doLogin())--先判断再绑定。
        //WxMpUser wxMpUser = wxMpService.getUserService().userInfo(wxMpOAuth2AccessToken.getOpenId());


        WebUtils.redirectToSavedRequest(request,response,"/r/m/index.htm");
    }

    // userInfo-登录回调--好像也不要用户确认啊？？？？？
    @RequestMapping("m/wx/snsapi_userinfo/loginCallback")
    public void userInfoLoginCallback(String code, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);

        //微信登录
        this.shiroLogin(wxMpOAuth2AccessToken, request, response);

        //登录成功绑定头像(已经在登录中处理了LoginVO.doLogin())--先判断再绑定。
        //WxMpUser wxMpUser = wxMpService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);

        WebUtils.redirectToSavedRequest(request,response,"/r/m/index.htm");
    }


    private void shiroLogin(WxMpOAuth2AccessToken wxMpOAuth2AccessToken, HttpServletRequest request, HttpServletResponse response) throws Exception{
        WxMpLoginVo loginVo = new WxMpLoginVo(wxMpOAuth2AccessToken.getOpenId(),IPUtil.getRemortIP(request));
        try {
            Subject subject = SecurityUtils.getSubject();
            // 执行认证操作.
            subject.login(loginVo);
        } catch (CustAuthenticationException e) {
            if (WxMpLoginVo.err_code_not_related.equals(e.getErrorCode())) {
                //未关联账号--重定向到账号密码登录页面
                WebUtils.issueRedirect(request,response,"/r/login.htm?oid=" + wxMpOAuth2AccessToken.getOpenId());
            }else {
                //其他异常抛出
                throw e;
            }
        }
    }

}
