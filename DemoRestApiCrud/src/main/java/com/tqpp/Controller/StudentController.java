package com.tqpp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	/*
	@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public Student getStudentById(@PathVariable("rollno") int id)
	{
		System.out.println(id);
		return  studservice.getStudentById(id);
	}
	*/
	
	//OR :-if student not fount then display error
	@ResponseBody
	@GetMapping(value="/students/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("rollno") int id)
	{
		
		Student obj=studservice.getStudentById(id);
		if(obj==null)
		    return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Student>(obj,HttpStatus.OK);
	}
	
	//Add/Insert
	@ResponseBody
	@PostMapping(value="/students")
	 public boolean addStudent(@RequestBody Student s)
	 {
		System.out.println("*********"+s);
		studservice.insertStudent(s);
		return true;
		 
	 }
	
	//Update
	@ResponseBody
	@PutMapping("/students/{sid}")
	public boolean updateStudent(@PathVariable("sid") int sid,@RequestBody Student s)
	{
		studservice.updateStudent(s);
		
		return true;
		
	}
	
	
	//Delete
	@ResponseBody
	@DeleteMapping(value="/delete/{id}")
	public boolean deleteStudent(@PathVariable("id") int sid)
	{
		Student s1=studservice.getStudentById(sid);                      //fetch student object
		studservice.deleteStudent(s1);
		return true;
	}

}
