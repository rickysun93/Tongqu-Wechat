package com.sjtu.Services;

import com.sjtu.Datamodels.AccessToken;
import com.sjtu.Utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunhaoran on 2016/10/21.
 */

@Component
public class ScheduledTasks {
    @Autowired
    private RestTemplate template;

    private final static String url = Constants.Wechaturl + "/cgi-bin/token?grant_type=client_credential&";
    private static String access_token = "";

    @Scheduled(fixedRate = 7000000)
    public void refreshat(){
        AccessToken at = template.getForObject(url + "appid={id}&secret={secret}", AccessToken.class,
                Constants.Appid, Constants.Appsecret);
        access_token = at.getAccess_token();
    }

    public static String getAccess_token() {
        return access_token;
    }
}
