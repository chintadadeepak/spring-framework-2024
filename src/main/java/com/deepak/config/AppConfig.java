package com.deepak.config;

import com.deepak.Alien;
import com.deepak.Computer;
import com.deepak.Desktop;
import com.deepak.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.deepak")
public class AppConfig {

//
//    @Bean
//    public Alien alien(Computer com) {
//        Alien alien = new Alien();
//        alien.setAge(20);
//        alien.setCom(com);
//        return alien;
//    }
//    @Bean
//    public Desktop getDesktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop getLaptop() {
//        return new Laptop();
//    }
}
