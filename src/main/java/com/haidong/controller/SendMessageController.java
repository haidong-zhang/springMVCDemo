package com.haidong.controller;

import com.haidong.utils.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: Don
 * @Date: 2019/3/11 15:13
 */
@Controller
@RequestMapping("msm")
public class SendMessageController {

    //用户名
    private static String Uid = "qq382440554";

    //接口安全秘钥
    private static String Key = "d41d8cd98f00b204e980";

    //短信内容
    private static String smsText = "<#> Your ExampleApp code is: 123ABC78\n" +
            "SOOz669tN6k";

    @GetMapping("send")
    public ModelAndView sendMsm(@RequestParam String phoneNumber){
        HttpClientUtil client = HttpClientUtil.getInstance();

//        //UTF发送
//        int result = client.sendMsgUtf8(Uid, Key, smsText, phoneNumber);
//        if(result>0){
//            System.out.println("UTF8成功发送条数=="+result);
//        }else{
//            System.out.println(client.getErrorMsg(result));
//        }
        ModelAndView modelAndView = new ModelAndView();
        //返回视图
        modelAndView.setViewName("/hello.jsp");
        modelAndView.addObject("msg","success!");
        return modelAndView;
    }
}
