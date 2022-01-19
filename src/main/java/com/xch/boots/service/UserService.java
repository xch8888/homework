package com.xch.boots.service;

import com.xch.boots.bean.User;
import com.xch.boots.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package: com.xch.boots.service
 * @ClassName: UserService
 * @author: 清欢.
 * @date: 2022/1/20 14:12
 */

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
}
