package com.errol.springbootbasic.component.i18n;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Myi18nHandler {

    private final GreetingService greetingService;

    public Myi18nHandler(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
