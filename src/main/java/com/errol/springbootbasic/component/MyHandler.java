package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.GreetingService;
import com.errol.springbootbasic.service.impl.GreetingServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class MyHandler {

    private final GreetingService greetingService;

    public MyHandler() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in my handler.");

        return this.greetingService.sayGreeting();
    }
}
