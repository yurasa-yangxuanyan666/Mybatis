package com.yanghui.Dao;

import com.yanghui.pojo.user;
import com.yanghui.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    static Logger logger= Logger.getLogger(UserDaoTest.class);
    @Test
    public void test(){
        //第一步：获取sqlsession对象
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        //执行sql方式一：getMapper
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
        user user1=userMapper.getUserById(1);
        System.out.println(user1);
        sqlSession.close();
    }
    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Integer res=mapper.addUser(new user(5,"央行","12456"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new user(4,"扬帆","555555"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        sqlSession.close();
    }
    @Test
    public  void testlog4j(){
        logger.info("info进入了testlog4j");
        logger.debug("debug进入了testlog4j");
        logger.error("error进入了testlog4j");
    }
}
