package com.vhicool.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:/provider.xml"});
        context.start();
        System.out.println("启动成功");
        System.in.read(); // 按任意键退出
    }
}