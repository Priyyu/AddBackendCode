package com.git.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.main.Model.Student;
import com.git.main.Service.Servicei;

@RestController
public class Controller 
{
@Autowired
Servicei si;

@PostMapping("/post")
public Student savestudent(@RequestBody Student student) {
	return si.savedata(student);
	
}
	
	@GetMapping("/get")
	public List<Student> getdata()
	{
		return si.getdata();
		
	}
	
	@PutMapping("/post/{id}")
	public Student updatedata(@RequestBody Student student,@PathVariable int id)
	{
		return si.updateData(student,id);
		
	}
	
	@DeleteMapping("/post/{id}")
	public String deletestudent(@PathVariable int id)
	{
		String stu =si.deletedata(id);
		return stu;
		
	}
}
