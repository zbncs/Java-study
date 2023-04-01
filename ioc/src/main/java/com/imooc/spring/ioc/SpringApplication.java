package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Apple;
import com.imooc.spring.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        String[] config = {"classpath:applicationContext.xml", "classpath:applicationContext1.xml"};
        // 初始化IOC容器并实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Apple sweetApple = context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple.getTitle());

        Apple apple2 = context.getBean("apple3", Apple.class);
        System.out.println(apple2.getTitle());

    }
}
