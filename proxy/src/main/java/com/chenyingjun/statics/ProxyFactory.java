package com.chenyingjun.statics;

/**
 * 代理工厂
 * @author chenyingjun
 */
public class ProxyFactory {

    public static AbstractObject proxyRealObject(AbstractObject abstractObject) {
        return new ProxyObject(abstractObject);
    }
}
