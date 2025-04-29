package com.errol.springbootbasic.service.impl;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from greeting service.";
    }
}
