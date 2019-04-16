package com.chenyingjun.statics;

/**
 * 代理对象
 * @author chenyingjun
 */
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
