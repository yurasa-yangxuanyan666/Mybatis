package com.yanghui.dao;

import com.yanghui.pojo.user;

import java.util.List;

public interface UserDao {
    List<user> getUserList();
    user getUserById(int id);
    Integer addUser(user user1);
    Integer updateUser(user user1);
    Integer deleteUser(int user1);
}
