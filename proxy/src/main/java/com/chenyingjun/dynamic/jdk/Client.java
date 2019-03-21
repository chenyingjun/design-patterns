package com.chenyingjun.dynamic.jdk;

public class Client {
    public static void main(String args[]) {
        IObject object = (IObject) ProxyFactory.getDynProxy(new RealObject());
        object.operation();
    }
}
