package com.chenyingjun.dynamic.gclib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象
 * @author chenyingjun
 */
public class ProxyObject implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理类操作开始");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("代理类操作结束");
        return result;
    }
}
