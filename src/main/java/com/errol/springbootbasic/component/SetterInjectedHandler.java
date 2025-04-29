package com.errol.springbootbasic.component;


import com.errol.springbootbasic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedHandler {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in setter-injected handler.");

        return this.greetingService.sayGreeting();
    }
}
