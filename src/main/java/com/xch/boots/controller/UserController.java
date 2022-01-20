package com.xch.boots.controller;

import com.xch.boots.bean.User;
import com.xch.boots.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @package: com.xch.boots.controller
 * @ClassName: UserController
 * @author: 清欢.
 * @date: 2022/1/20 14:34
 */

@Slf4j
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String toAddUser(){
        return "add";
    }

    @PostMapping("/addUser")
    public String addUser(User user){
        if(userService.addUser(user)>0){
            return "main";
        }else{
            log.info("添加失败");
            return "error";
        }
    }

    @ResponseBody
    @PostMapping("/getUserById")
    public User getUserById(@RequestParam("id")Integer id){
        User user=userService.getUserById(id);
        return user;
    }
}
