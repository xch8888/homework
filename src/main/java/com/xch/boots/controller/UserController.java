package com.xch.boots.controller;

import com.xch.boots.bean.User;
import com.xch.boots.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @package: com.xch.boots.controller
 * @ClassName: UserController
 * @author: 清欢.
 * @date: 2022/2/9 15:50
 */

@Slf4j
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(Model model, HttpSession session,
                          @RequestParam("name") String name,
                          @RequestParam("pwd") String pwd){
        User u = userService.login(name,pwd);
        if (u!=null){
            session.setAttribute("loginUser",u);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String toMain(HttpSession session,Model model){
        if (session.getAttribute("loginUser")!=null){
            return "main";
        }else {
            model.addAttribute("msg","请先登入");
            return "login";
        }
    }
    @RequestMapping("/zhuce")
    public String toZhuCe(){
        return "zhuce.html";
    }

    //注册的邮箱验证码
    @ResponseBody
    @RequestMapping("/emailyz")
    public boolean emailyz(String ema,HttpSession session) {
        boolean flag=false;
        try{
            if ((ema.indexOf("@")>-1)&&(ema.indexOf(".")>-1)) {
                HtmlEmail email = new HtmlEmail();
                email.setHostName("smtp.qq.com");
                email.setCharset("utf-8");
                email.addTo(ema);
                email.setFrom("771219879@qq.com", "tmh");
                email.setAuthentication("771219879@qq.com", "yivguwohkzrubegj");
                email.setSubject("集齐拼图皓哥赞助活动验证码");
                String yzm = yzm();
                session.setAttribute("getema", ema);
                session.setAttribute("yzm", yzm);
                session.setAttribute("names",yzm());
                email.setMsg("随机验证码:" + yzm+"=============亲爱的用户这是您的用户名:"+
                        session.getAttribute("names")+
                        "(请记住你的用户名,用于登录)");
                email.send();
                log.info((String)session.getAttribute("names"));
                log.info((String)session.getAttribute("yzm"));
                flag = true;
            }else {
                log.info("邮箱错误");
                flag=false;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return flag;
    }
    //随机验证码
    public String yzm(){
        String str = "";
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        for (int i = 0; i <6; i++){
            char num = ch[random.nextInt(ch.length)];
            str += num;
        }
        System.out.println(str);
        return str;
    }

    @ResponseBody
    @RequestMapping("/register")
    public String register(@RequestParam("pwd") String pwd, @RequestParam("pwd2") String pwd2,
                           @RequestParam("yqm") String yqm, User user, HttpSession session){
        String flag="true";
        if (pwd.equals(pwd2)){
            user.setEmail((String)session.getAttribute("getema"));
            user.setPwd(pwd);
            user.setEmailverify((String)session.getAttribute("yzm"));
            user.setInvitationCode(yqm);
            user.setName((String)session.getAttribute("names"));
            userService.register(user);
            return "login";
        }else {
            return flag="注册失败";
        }
    }


    @GetMapping("/lunbotu")
    public String lunbotu(){
        return "lunbotu";
    }

    @GetMapping("/blindBox")
    public String blindBox(){
        return "blindBox";
    }

    @GetMapping("/blindBoxXq")
    public String blindBoxXq(){
        return "blindBoxXq";
    }

    @GetMapping("/pingtulist")
    public String pingtulist(){
        return "pingtulist";
    }

}
