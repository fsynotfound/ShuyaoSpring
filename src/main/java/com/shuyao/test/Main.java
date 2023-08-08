package com.shuyao.test;

import com.shuyao.spring.ShuyaoApplicationContext;

public class Main {
    public static void main(String[] args) {
        //用spring测试
        ShuyaoApplicationContext shuyaoApplicationContext=new ShuyaoApplicationContext(AppConfig.class);
        UserService userService = (UserService) shuyaoApplicationContext.getBean("userService");
        System.out.println(userService);
    }
}
