package com.yanghui.Dao;

import com.yanghui.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    //获取老师
    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher(@Param("tid") int id);
}
