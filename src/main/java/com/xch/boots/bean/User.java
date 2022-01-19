package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @package: com.xch.boots.bean
 * @ClassName: User
 * @author: 清欢.
 * @date: 2022/1/20 13:56
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id; //用户id
    private String userName;    //用户姓名
    private String password;    //用户密码
    private String email;   //邮箱
    private String invitationCode;  //邀请码
    private String headportrait;    //头像
    private String personalintroduction;    //个人介绍
}
