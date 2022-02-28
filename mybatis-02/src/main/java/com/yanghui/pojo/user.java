package com.yanghui.pojo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class user {
    private int id;
    private  String name;
    private String pwd;
    public user(){}

    public user(int id, String name, String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
