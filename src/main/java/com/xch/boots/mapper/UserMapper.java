package com.xch.boots.mapper;

import com.xch.boots.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @package: com.xch.boots.mapper
 * @ClassName: UserMapper
 * @author: 清欢.
 * @date: 2022/1/20 14:01
 */

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user 对象
     * @return 受影响行数
     */
    public int addUser(User user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public User getUserById(@Param("id") Integer id);
}
