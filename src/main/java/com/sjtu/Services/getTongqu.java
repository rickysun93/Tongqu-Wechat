package com.sjtu.Services;

import com.sjtu.Datamodels.Sendalltext;
import com.sjtu.Datamodels.Sendalltext_text;
import com.sjtu.Datamodels.Tongqu;
import com.sjtu.Datamodels.Tongqu_acts;
import com.sjtu.Utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunhaoran on 2016/10/21.
 */
@Component
public class getTongqu {
    @Autowired
    private RestTemplate template;

    private String url = Constants.Wechaturl + "/cgi-bin/message/mass/sendall?access_token=";
    private String acts = "";

    @Scheduled(fixedRate = 3600000)
    public void update(){
        acts = "";
        Tongqu tq = template.getForObject(Constants.Tongquurl, Tongqu.class);
        for (Tongqu_acts tqas:tq.getResult().getActs()) {
            if(tqas.getActid().compareTo(Constants.Latestactid)>0){
                acts+="【"+tqas.getName()+'\n'+tqas.getStart_time()+"  \nhttp://www.tongqu.me/act/"+tqas.getActid()+"】\n\n";
            } else {
                break;
            }
        }
        Constants.Latestactid = tq.getResult().getActs()[0].getActid();

        if(acts!=""){
            //HttpHeaders headers =new HttpHeaders();
            //headers.setContentType(MediaType.APPLICATION_JSON);
            //HttpEntity request=new HttpEntity(someBean, headers);

            Sendalltext text = new Sendalltext();
            text.setText(new Sendalltext_text(acts));

            String haha = template.postForObject(url + "{at}", text, String.class, ScheduledTasks.getAccess_token());
            //System.out.println(acts);
            System.out.println(haha);
        }
    }
}
