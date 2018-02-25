package txc.xxy.ssm.config;

import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: txc
 * @date: 18-2-25 下午5:20
 */
//@Configuration
public class WxMpConfig {
    @Value("#{wxmpappId}")
    protected String appId;
    @Value("#{wx.mp.secret}")
    protected String secret;
    @Value("#{wx.mp.token}")
    protected String token;


    @Bean
    public WxMpService getWxService (){
        WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
        config.setAppId(appId); // 设置微信公众号的appid
        config.setSecret(secret); // 设置微信公众号的app corpSecret
        config.setToken(token); // 设置微信公众号的token
        //config.setAesKey("..."); // 设置微信公众号的EncodingAESKey
        WxMpService wxService = new WxMpServiceImpl();
        wxService.setWxMpConfigStorage(config);
        return wxService;
    }
}
