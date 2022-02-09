package com.xch.boots.mapper;

import com.xch.boots.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @package: com.xch.boots.mapper
 * @ClassName: UserMapper
 * @author: 清欢.
 * @date: 2022/2/9 15:45
 */

@Mapper
public interface UserMapper {
    public User login(@Param("userName") String userName,@Param("password") String password);
}
