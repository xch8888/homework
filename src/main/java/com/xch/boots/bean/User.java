package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: User用户表
 * @author: 清欢.
 * @date: 2022/1/19 14:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String email;
    private String emailverify;
    private String invitationCode;
    private String selfIntroduction;
    private Integer integral;
    private String headPortrait;

}
