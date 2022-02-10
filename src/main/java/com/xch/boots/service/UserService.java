package com.xch.boots.service;

import com.xch.boots.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户业务逻辑层接口
 */
public interface UserService {
    /**
     * 用户登录方法
     * @param name 用户名
     * @param pwd 密码
     * @return 用户对象
     */
    public User login(@Param("name") String name, @Param("pwd")String pwd);

    /**
     * 用户注册方法
     * @param user 用户对象
     * @return 受影响行数(注册是否成功)
     */
    public boolean register(User user);
}
