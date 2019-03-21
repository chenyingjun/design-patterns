package com.chenyingjun.statics;

public class ProxyObject extends AbstractObject {

    public AbstractObject abstractObject;

    public ProxyObject(AbstractObject abstractObject) {
        this.abstractObject = abstractObject;
    }

    @Override
    public void operation() {
        System.out.println("代理类操作开始");
        abstractObject.operation();
        System.out.println("代理类操作结束");
    }
}
