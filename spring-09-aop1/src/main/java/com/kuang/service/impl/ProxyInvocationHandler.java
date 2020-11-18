package com.kuang.service.impl;

import com.kuang.service.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/16
 */
// 自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setRent(Object target) {
        this.target = target;
    }

    // 生成得到的代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射机制实现！
        System.out.println("Before invoke " + method.getName());
//        seeHouse();
        // 反射执行目标对象的方法
        Object result = method.invoke(target, args);
//        fare();
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("中介收取中介费");
    }
}
