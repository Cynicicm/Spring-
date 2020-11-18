package com.kuang.pojo;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/14
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User的无参构造");
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
