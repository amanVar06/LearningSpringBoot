package com.amanv.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // field injection
    @Qualifier("laptop") // Qualifier takes class name starting with small letter
    private Computer comp;

    // constructor injection (no need of AutoWired annotation here)
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    private Laptop laptop;

//    @Autowired // setter injection
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        comp.compile();
        System.out.println("Welcome to MyApp!");
    }
}
