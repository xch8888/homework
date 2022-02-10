package com.xch.boots.service.impl;

import com.xch.boots.bean.User;
import com.xch.boots.mapper.UserMapper;
import com.xch.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package: com.tmh.winterproject.service.impl
 * @ClassName: UserServiceImpl
 * @author: 清欢.
 * @date: 2022/1/19 15:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String name, String pwd) {
        return userMapper.login(name, pwd);
    }

    @Override
    public boolean register(User user) {
        return userMapper.register(user)>0;
    }
}
