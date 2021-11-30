package com.example.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.model")
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);
		College college = context.getBean(College.class);
		college.setName("ABC");
        System.out.println("Welcome to "+college.getName());
		college.startcollege();
		context.close();

	}

}
