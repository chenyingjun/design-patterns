package com.chenyingjun.statics;

public class Client {
    public static void main(String args[]) {
        ProxyFactory.ProxyRealObject(new RealObject()).operation();

        ProxyObject object = new ProxyObject(new RealObject());
        object.operation();
    }
}
