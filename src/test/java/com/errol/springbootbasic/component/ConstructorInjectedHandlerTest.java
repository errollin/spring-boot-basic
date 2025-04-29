package com.errol.springbootbasic.component;

import com.errol.springbootbasic.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedHandlerTest {

    ConstructorInjectedHandler constructorInjectedHandler;

    @BeforeEach
    void setUp() {
        this.constructorInjectedHandler = new ConstructorInjectedHandler(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(this.constructorInjectedHandler.sayHello());
    }
}