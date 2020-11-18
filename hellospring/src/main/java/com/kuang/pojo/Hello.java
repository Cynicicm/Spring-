package com.kuang.pojo;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/14
 */
public class Hello {
    public Hello(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Hello() {
    }

    private String str;

}
