package com.yanghui.pojo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class user {
    private int id;
    private  String name;
    private String password;
    public user(){}

    public user(int id, String name, String password){
        this.id=id;
        this.name=name;
        this.password =password;
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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + password + '\'' +
                '}';
    }
}
