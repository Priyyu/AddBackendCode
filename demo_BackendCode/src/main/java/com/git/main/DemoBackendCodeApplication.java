package com.git.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.git.main.Model.Student;

@SpringBootApplication
public class DemoBackendCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackendCodeApplication.class, args);
	   Student s=new Student();
	   System.out.println(s);
	}

}
