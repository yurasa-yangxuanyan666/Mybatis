package com.yanghui.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;

    //学生需要关联老师
    private Teacher teacher;

    public Student(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public Student() {
    }
}
