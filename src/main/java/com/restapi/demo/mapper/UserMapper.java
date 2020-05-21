package com.restapi.demo.mapper;

import com.restapi.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: huld
 * @Date: 2020-04-17 15:48
 */
@Mapper
public interface UserMapper {
    @Select("select * from t_user where id = #{id}")
    User getUserById(int id);
    @Select("select * from t_user where username = #{username} and password = #{password}")
    User getUserByUserNameAndPwd(String username,String password);
}
