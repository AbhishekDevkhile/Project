package com.tqpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tqpp.model.Student;
import com.tqpp.service.studentService;

@Controller
public class StudentController { 
	
	@Autowired
	private studentService studservice;
	
	
	@GetMapping("/")
	public ModelAndView startpage()
	{
		List<Student>lst=studservice.getAllStudents(); 
	//	System.out.println("*****"+lst);
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("studlist",lst);
		return mv;
		
	}
	
	
	//for delete
	
	@GetMapping("/delete")
	public String deletestudent(@RequestParam("id") int id)
	{
		Student ob=studservice.getStudentById(id);
		
		if(ob!=null)
		{
			studservice.deleteStudent(ob);
		}
		return "redirect:/";                        //redirect to home page
	}
	
	//for Add
	@GetMapping("/add")
	public String AddNewStudent()
	{
		return "add";
	}
	
	@GetMapping("/save")
	//save new student(add )
	public String saveStudent(@ModelAttribute("stud") Student s1)
	{
		studservice.insertStudent(s1);
		return "redirect:/"; 
	}
	
	
	

}
