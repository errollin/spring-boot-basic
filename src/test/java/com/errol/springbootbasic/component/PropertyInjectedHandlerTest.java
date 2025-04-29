package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedHandlerTest {

    PropertyInjectedHandler propertyInjectedHandler;

    @BeforeEach
    void setUp() {
        this.propertyInjectedHandler = new PropertyInjectedHandler();
        this.propertyInjectedHandler.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(this.propertyInjectedHandler.sayHello());
    }
}