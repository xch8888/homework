package com.xch.boots.controller;

import com.xch.boots.tools.SendMessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @package: com.xch.boots.controller
 * @ClassName: EmailController
 * @author: 清欢.
 * @date: 2022/2/9 14:10
 */

@Controller
@RequestMapping("/user")
public class EmailController {

    /**
     * 发送邮件
     * @param userMail
     * @return
     */
    @RequestMapping("/getEmailVerify")
    @ResponseBody
    public String getEmailVerify(String userMail){
        System.out.println("从前台接受的邮箱号："+userMail);
        if(userMail!=null){
            //1.ver生成6位随机数
            int ver1=(int)(Math.random() * 899999)+100000;
            //2.类型转换
            String ver = String.valueOf(ver1);
            SendMessageService sendMessageService=new SendMessageService();
            //3.将HTML传来的值和生成的随机数传入发送邮件的工具类里
            sendMessageService.sendMessage("userEmail",ver1);
            //邮箱不为空将生成的随机验证码ver传回页面
            return ver;
        }else{
            //邮箱为空返回提示信息
            return "发送失败";
        }
    }
}
