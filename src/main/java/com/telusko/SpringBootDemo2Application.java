package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.Amazon;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(SpringBootDemo2Application.class, args);
		Amazon amazon=cont.getBean(Amazon.class);
		Boolean status=amazon.deliverProduct(8589.65);
		if (status){
			System.out.println("product deliver successfully");
		}else {
			System.out.println("product deliver failed");
		}
	}

}
