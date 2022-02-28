package com.yanghui.dao;

import com.yanghui.Dao.UserMapper;
import com.yanghui.pojo.user;
import com.yanghui.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class userMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        //底层都是通过反射开发
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<user> userList=userMapper.getUserList();
        for (user users:userList
        ) {
            System.out.println(users);
        }
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        user user1=userMapper.getUserByID(1);
        System.out.println(user1);
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Integer res=mapper.adduser(new user(7,"央是否","12456"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.update(new user(4,"扬帆","555555"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.delete(5);
        sqlSession.close();
    }
}
