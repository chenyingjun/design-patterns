package com.chenyingjun.statics;

/**
 * 客户端
 * @author chenyingjun
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory.proxyRealObject(new RealObject()).operation();

        ProxyObject object = new ProxyObject(new RealObject());
        object.operation();
    }
}
