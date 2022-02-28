package com.yanghui.dao;

import com.yanghui.Dao.TeacherMapper;
import com.yanghui.pojo.Teacher;
import com.yanghui.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class mytest {
   @Test
    public void test2(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        TeacherMapper teacherMapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=teacherMapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
