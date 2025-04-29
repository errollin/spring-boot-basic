package com.errol.springbootbasic;

import com.errol.springbootbasic.component.MyHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootBasicApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private MyHandler myHandler;

    @Test
    void testAutowireOfHandler() {
        System.out.println(this.myHandler.sayHello());
    }

    @Test
    void testGetBeanFromContext() {
        MyHandler handler = applicationContext.getBean(MyHandler.class);
        System.out.println(handler.sayHello());
    }

	@Test
	void contextLoads() {
	}

}
