package com.kuang.controller;

import com.kuang.service.Rent;
import com.kuang.service.impl.Host;
import com.kuang.service.impl.ProxyInvocationHandler;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/16
 */
public class Client {
    public static void main(String[] args) {

        // 真实角色
        Rent rent = new Host();

        // 代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 通过代用这个程序处理角色来处
        // 理我们要调用的接口对象
        pih.setRent(rent);

        Rent proxy = (Rent) pih.getProxy();

//        proxy.rent();
        proxy.fare();
    }
}
