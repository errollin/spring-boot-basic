package com.errol.springbootbasic;

import com.errol.springbootbasic.component.MyHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootBasicApplication.class, args);

		MyHandler myHandler = ctx.getBean(MyHandler.class);

		System.out.println("In main method: ");
		System.out.println(myHandler.sayHello());	}

}
