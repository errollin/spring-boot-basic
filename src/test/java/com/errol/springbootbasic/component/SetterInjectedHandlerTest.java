package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedHandlerTest {

    SetterInjectedHandler setterInjectedHandler;

    @BeforeEach
    void setUp() {
        this.setterInjectedHandler = new SetterInjectedHandler();
        this.setterInjectedHandler.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(this.setterInjectedHandler.sayHello());
    }
}