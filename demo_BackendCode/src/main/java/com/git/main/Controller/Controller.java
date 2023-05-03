package com.git.main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{

	@GetMapping("/get")
	public String getdata()
	{
		return "add data successfully";
		
	}
}
