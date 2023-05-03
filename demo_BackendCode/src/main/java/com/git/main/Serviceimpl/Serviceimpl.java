package com.git.main.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.main.Model.Student;
import com.git.main.Repository.HomeRepository;
import com.git.main.Service.Servicei;

@Service
public class Serviceimpl implements Servicei
{
  @Autowired
  HomeRepository hr;
	@Override
	public Student savedata(Student student) 
	{
		
		return hr.save(student);
	}
	@Override
	public List<Student> getdata() 
	{
	
		return hr.findAll();
	}
	@Override
	public Student updateData(Student student, int id) 
	{
		Optional<Student> findById=hr.findById(id);
				if(findById.isPresent())
				{
					student.setSid(findById.get().getSid());
				 return  hr.save(student);
				}
				else 
				{
					return new Student();
				}
				
					
	}
	@Override
	public String deletedata(int id) {
		
		Optional<Student> findById=hr.findById(id);
		if(findById.isPresent())
		{
			hr.deleteById(findById.get().getSid());
		 return  "delete";
		}
		else 
		{
			return "not deleted";
		}
	}	

}
