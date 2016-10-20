package com.sjtu.Controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by sunhaoran on 2016/10/19.
 */

@CrossOrigin
@RestController
public class controller {

    private final String token = "rickysun93";

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public @ResponseBody String AuthController(String signature, String timestamp, String nonce, String echostr){
//        if(new String(DigestUtils.sha1(nonce + timestamp + token))==signature)
//            return echostr;
//        else
//            return "failed";
        return "haha";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public @ResponseBody String HelloController(){
        System.out.println("hello");
        return "Hello World!";
    }
}
