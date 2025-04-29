package com.errol.springbootbasic.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyHandlerTest {

    MyHandler myHandler;

    @BeforeEach
    void setUp() {
        this.myHandler = new MyHandler();
    }

    @Test
    void sayHello() {
        System.out.println(this.myHandler.sayHello());
    }
}