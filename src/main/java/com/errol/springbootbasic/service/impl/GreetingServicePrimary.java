package com.errol.springbootbasic.service.impl;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the primary bean.";
    }
}
