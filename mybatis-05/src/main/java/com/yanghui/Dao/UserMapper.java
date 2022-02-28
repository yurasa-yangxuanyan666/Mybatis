package com.yanghui.Dao;

import com.yanghui.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select*from user")
    List<user> getUserList();

    @Select("select*from user where id=#{id}")
    user getUserByID(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int adduser(user users);

    @Update("update user set name=#{name},pwd=#{password}where id=#{id}")
    int update(user users);

    @Delete("delete from user where id=#{id}")
    int delete(@Param("id") int id);
}
