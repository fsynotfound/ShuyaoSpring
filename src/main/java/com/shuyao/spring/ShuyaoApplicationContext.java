package com.shuyao.spring;

import java.lang.annotation.Annotation;

public class ShuyaoApplicationContext {
    private Class configClass;

    public ShuyaoApplicationContext(Class configClass) { //构造方法
        this.configClass = configClass;
        //解析配置类
        ComponentScan annotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
        String path=annotation.value(); //扫描路径
        System.out.println(path); //打印出com.shuyao.test
    }

    public Object getBean(String beanName) {

        return null;
    }
}
