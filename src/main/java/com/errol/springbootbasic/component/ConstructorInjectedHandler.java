package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedHandler {

    private final GreetingService greetingService;

    public ConstructorInjectedHandler(@Qualifier(value = "greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in constructor-injected handler.");

        return this.greetingService.sayGreeting();
    }
}
