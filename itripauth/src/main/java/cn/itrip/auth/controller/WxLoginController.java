package cn.itrip.auth.controller;

import cn.itrip.common.UrlUtils;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/wx/api")
public class WxLoginController {

    private Logger logger = Logger.getLogger(WxLoginController.class);

    @RequestMapping("/callBack")
    public void callback(@RequestParam String code, @RequestParam String state, HttpServletResponse response) throws IOException {
        /**
         * appid 应用唯一标识(网站应用审核通过后，会获取到appid和appsecret)
         * secret 应用密钥AppSecret，在微信开放平台提交应用审核通过后获得
         * code 填写第一步获取的code参数
         * grant_type 填authorization_code
         */
        String accessUrl = "https://api.weixin.qq.com/sns/oauth2/access_token" +
                "?appid=wx26e27b54409e8c4c" +
                "&secret=26f90c61837491d2b96770ecc03e1ad3" +
                "&code=" + code +
                "&grant_type=authorization_code";
        String jsonStr= UrlUtils.loadURL(accessUrl);
        Map<String ,String> accessMap = JSON.parseObject(jsonStr, Map.class);
        String accessToken = accessMap.get("access_token");
        String openId = accessMap.get("openid");
        logger.info("accessToken的值为：" + accessToken + ",openId的值为：" + openId);
        String userInfoUrl = "https://api.weixin.qq.com/sns/userinfo" +
                "?access_token=" + accessToken + "&openid=" + openId;
        String userInfoStr = UrlUtils.loadURL(userInfoUrl);
        Map<String,String> userInfoMap = JSON.parseObject(userInfoStr, Map.class);
        //3.3 获取用户个人信息
        String city = userInfoMap.get("city"); //获取用户信息中的城市
        String nickname = userInfoMap.get("nickname");
        logger.info("city的值为：" + city + "，nickname的值为：" + nickname);
        response.sendRedirect("http://www.baidu.com");

    }

}
