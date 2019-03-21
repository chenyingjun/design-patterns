package com.chenyingjun.statics;

public class ProxyFactory {

    public static AbstractObject ProxyRealObject(AbstractObject abstractObject) {
        return new ProxyObject(abstractObject);
    }
}
