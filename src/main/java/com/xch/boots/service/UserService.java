package com.xch.boots.service;

import com.xch.boots.bean.User;
import com.xch.boots.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @package: com.xch.boots.service
 * @ClassName: UserService
 * @author: 清欢.
 * @date: 2022/2/9 15:48
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getLogin(String userName, String password){
        User user=userMapper.login(userName,password);
        return user;
    }
}
