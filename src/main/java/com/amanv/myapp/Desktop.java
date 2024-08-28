package com.amanv.myapp;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {

        System.out.println("Compiling code started with Desktop ....");
    }
}
