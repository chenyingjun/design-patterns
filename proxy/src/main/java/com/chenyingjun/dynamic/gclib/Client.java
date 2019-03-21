package com.chenyingjun.dynamic.gclib;


public class Client {
    public static void main(String args[]) {
        RealObject object = (RealObject) ProxyFactory.getGcLibDynProxy(new RealObject());
        object.operation();
    }
}
