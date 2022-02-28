package com.yanghui.dao;

import com.yanghui.Dao.StudentMapper;
import com.yanghui.Dao.TeacherMapper;
import com.yanghui.pojo.Student;
import com.yanghui.pojo.Teacher;
import com.yanghui.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
  @Test
          public void Teacher(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        TeacherMapper mapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=mapper.getTeacher(1);
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void TestStudent(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsList=mapper.getStudent();
        for (Student student:studentsList
        ) {
            System.out.println(student);
        }
        //提交事务

        sqlSession.close();
    }
    @Test
    public void TestStudent2(){
        SqlSession sqlSession= mybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsList=mapper.getStudent2();
        for (Student student:studentsList
        ) {
            System.out.println(student);
        }
        //提交事务

        sqlSession.close();
    }
}

