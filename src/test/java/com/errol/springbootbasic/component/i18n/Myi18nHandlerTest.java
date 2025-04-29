package com.errol.springbootbasic.component.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ZH")
@SpringBootTest
class Myi18nHandlerTest {

    @Autowired
    Myi18nHandler myi18nHandler;

    @Test
    void sayHello() {
        System.out.println(this.myi18nHandler.sayHello());
    }
}