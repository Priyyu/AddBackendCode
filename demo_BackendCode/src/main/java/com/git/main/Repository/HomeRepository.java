package com.git.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.main.Model.Student;

public interface HomeRepository extends JpaRepository<Student, Integer>
{

}
