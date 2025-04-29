package com.errol.springbootbasic.component;

import org.springframework.stereotype.Component;

@Component
public class MyHandler {

    public String sayHello() {
        System.out.println("I'm in my handler.");

        return "Hello!";
    }
}
