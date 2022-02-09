package com.xch.boots.controller;

import com.xch.boots.bean.User;
import com.xch.boots.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @package: com.xch.boots.controller
 * @ClassName: UserController
 * @author: 清欢.
 * @date: 2022/2/9 15:50
 */

@Slf4j
@Controller
public class UserController {

    @Resource
    UserService userService;

    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 登录处理
     * @param userName
     * @param password
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/login")
    public String doLogin(@RequestParam("userName") String userName,
                          @RequestParam("password") String password,
                          HttpSession session,
                          Model model){
        User user=userService.getLogin(userName,password);
        log.info("数据:"+user);
        if(user!=null){
            //写入session
            session.setAttribute("loginUser",user);
            //登录成功
            return "redirect:/main.html";
        }else {
            model.addAttribute("error","用户名或者密码错误");
            return "login";
        }
    }
}
