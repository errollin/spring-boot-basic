package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedHandler {

    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in property-injected handler.");

        return this.greetingService.sayGreeting();
    }
}
