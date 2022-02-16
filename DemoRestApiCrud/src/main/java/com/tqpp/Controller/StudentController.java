package com.tqpp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.tqpp.Model.Student;
import com.tqpp.service.studentService;

  
@Controller 
public class StudentController {
	
	
	@Autowired  
	private studentService studservice;
	
	@ResponseBody
	@GetMapping(value="/students",produces="application/json")
	public List<Student> getAllStudents()
	{
		return studservice.getAllStudents();
		
	}
	
	@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public Student getStudentById(@PathVariable("rollno") int id)
	{
		System.out.println(id);
		return  studservice.getStudentById(id);
	}
	
	
	
	@PostMapping(value="/students",produces="application/json")
	 public boolean addStudent(Student s)
	 {
		
		
		return false;
		 
	 }

}
