package com.chenyingjun.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * @author chenyingjun
 */
public class ProxyFactory {
    public static Object getDynProxy(Object object) {
        InvocationHandler handler = new ProxyObject(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), handler);
    }
}
