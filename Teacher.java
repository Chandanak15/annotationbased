package com.example.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("teacher")
public class Teacher {

	public void teach() {
		System.out.println("Teacher is teaching");
	}


	
	
}
