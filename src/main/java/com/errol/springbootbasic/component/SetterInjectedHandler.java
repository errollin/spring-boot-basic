package com.errol.springbootbasic.component;


import com.errol.springbootbasic.service.GreetingService;

public class SetterInjectedHandler {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in setter-injected handler.");

        return this.greetingService.sayGreeting();
    }
}
