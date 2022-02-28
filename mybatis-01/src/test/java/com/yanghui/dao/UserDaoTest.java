package com.yanghui.dao;

import com.yanghui.pojo.user;
import com.yanghui.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取sqlsession对象
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        //执行sql方式一：getMapper
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<user> userList=userDao.getUserList();
        for (user users:userList
             ) {
            System.out.println(users);
        }
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        user user1=userDao.getUserById(1);
        System.out.println(user1);
        sqlSession.close();
    }
    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
        Integer res=mapper.addUser(new user(5,"央行","12456"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new user(4,"扬帆","555555"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(5);
        sqlSession.close();
    }
}
