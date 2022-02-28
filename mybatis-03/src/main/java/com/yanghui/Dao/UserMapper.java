package com.yanghui.Dao;

import com.yanghui.pojo.user;

import java.util.List;

public interface UserMapper {
    List<user> getUserList();
    user getUserById(int id);
    Integer addUser(user user1);
    Integer updateUser(user user1);
    Integer deleteUser(int user1);
}
