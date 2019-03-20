package com.rminfo.model;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/4
 * Time: 15:59
 * 项目名：ssmSSO
 * 描述：TODO
 * Description: No Description
 */

public class User {

    private int id;
    private String name;
    private int age;
    private String password;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
