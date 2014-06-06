package com.aguacatala.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aguacatala.core.service.MessageService;

@Configuration
@ComponentScan
public class App {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(
				App.class);
		MessageService printer = context.getBean(MessageService.class);
		System.out.println(printer.getMessage());
	}
}