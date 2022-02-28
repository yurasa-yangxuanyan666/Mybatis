package com.yanghui.utilis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {//读取mybatis-config.xml文件
           String resource="mybatis-config.xml";
           InputStream inputStream=Resources.getResourceAsStream(resource);
           sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }catch (IOException e){
        e.printStackTrace();
        }
    }

    //设置自动提交事务
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }



}
