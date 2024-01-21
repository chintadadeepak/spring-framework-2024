package com.deepak;

import com.deepak.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien = context.getBean(Alien.class);
//        Computer com = context.getBean(Computer.class);
////        System.out.println(alien.getAge());
        alien.code();
        System.out.println(alien.getAge());
//        Desktop desktop1 = context.getBean("dBean", Desktop.class);
//////        desktop1.compile();
//        Desktop desktop2 = context.getBean("dBean", Desktop.class);
//////        desktop1.compile();
//        System.out.println(desktop1.equals(desktop2));
















//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.code();

//        Computer com = context.getBean(Computer.class);
//        com.compile();
//        Laptop lap = context.getBean("lap", Laptop.class);
    }
}
