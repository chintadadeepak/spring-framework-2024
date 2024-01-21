package com.deepak;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop object created..");
    }
    public void compile() {
        System.out.println("Compiling using desktop..");
    }
}
