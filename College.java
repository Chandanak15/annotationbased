package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Qualifier("college")
public class College {
	
	private  Student student;
	
	private  Teacher teacher;
	
	private String name;

	@Autowired
	public College(Student student, Teacher teacher) {
		super();
		this.student = student;
		this.teacher = teacher;
	}
	
	
	
	public String getName() {
		return name;
	}


    @Required
	public void setName(String name) {
		this.name = name;
	}
  
    


	public void startcollege() {
		teacher.teach();
		student.study();
	}
	
	
}