package com.errol.springbootbasic.service.i18n;

import com.errol.springbootbasic.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "ZH")
@Service(value = "i18nService")
public class ChineseGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "你好 世界 - ZH";
    }
}
