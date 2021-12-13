package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanA.class);
		context.refresh();
		System.out.println(context.getBean(BeanA.class));
	}
}
