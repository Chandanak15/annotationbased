package com.example.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Student {
	
	public void study() {
		System.out.println("Students are studying");
	}

}
