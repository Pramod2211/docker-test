package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.service.OrderService;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		
		//ConfigurableApplicationContext ctx =
				SpringApplication.run(DemoAppApplication.class, args);
		
	//OrderService order	= ctx.getBean(OrderService.class);
	//order.processOrder(0);
	}

}
