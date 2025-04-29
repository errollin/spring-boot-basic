package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.GreetingService;

public class PropertyInjectedHandler {

    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in property-injected handler.");

        return this.greetingService.sayGreeting();
    }
}
