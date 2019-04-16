package com.chenyingjun.dynamic.gclib;


import net.sf.cglib.proxy.Enhancer;

/**
 * 代理工厂
 * @author chenyingjun
 */
public class ProxyFactory {
    public static Object getGcLibDynProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new ProxyObject());
        Object targetProxy = enhancer.create();
        return targetProxy;
    }
}
