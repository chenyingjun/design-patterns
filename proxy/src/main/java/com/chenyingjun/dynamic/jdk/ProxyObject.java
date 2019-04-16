package com.chenyingjun.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理对象
 * @author chenyingjun
 */
public class ProxyObject implements InvocationHandler {

    /**
     * 被代理的对象
     */
    public Object object;

    public ProxyObject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类操作开始");
        Object result = method.invoke(object, args);
        System.out.println("代理类操作结束");
        return result;
    }
}
