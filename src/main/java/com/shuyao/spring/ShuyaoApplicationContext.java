package com.shuyao.spring;

public class ShuyaoApplicationContext {
    private Class configClass;

    public ShuyaoApplicationContext(Class configClass) { //构造方法
        this.configClass = configClass;
    }

    public Object getBean(String beanName) {

        return null;
    }
}
