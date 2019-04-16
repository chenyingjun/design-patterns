package com.chenyingjun.dynamic.jdk;

/**
 * 客户端
 * @author chenyingjun
 */
public class Client {
    public static void main(String[] args) {
        IObject object = (IObject) ProxyFactory.getDynProxy(new RealObject());
        object.operation();
    }
}
