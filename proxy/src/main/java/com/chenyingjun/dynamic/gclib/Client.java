package com.chenyingjun.dynamic.gclib;


/**
 * 客户端
 * @author chenyingjun
 */
public class Client {
    public static void main(String[] args) {
        RealObject object = (RealObject) ProxyFactory.getGcLibDynProxy(new RealObject());
        object.operation();
    }
}
