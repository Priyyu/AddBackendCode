package com.git.main.Service;

import java.util.List;

import com.git.main.Model.Student;

public interface Servicei {

public	Student savedata(Student student);

public List<Student> getdata();

public Student updateData(Student student, int id);

public String deletedata(int id);

}
