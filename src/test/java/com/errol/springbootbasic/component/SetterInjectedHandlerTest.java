package com.errol.springbootbasic.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedHandlerTest {

    @Autowired
    SetterInjectedHandler setterInjectedHandler;

    @Test
    void sayHello() {
        System.out.println(this.setterInjectedHandler.sayHello());
    }
}