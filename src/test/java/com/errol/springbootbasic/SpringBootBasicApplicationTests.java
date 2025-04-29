package com.errol.springbootbasic;

import com.errol.springbootbasic.component.MyHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBasicApplicationTests {

    @Autowired
    private MyHandler myHandler;

    @Test
    void testAutowireOfHandler() {
        System.out.println(this.myHandler.sayHello());
    }

	@Test
	void contextLoads() {
	}

}
