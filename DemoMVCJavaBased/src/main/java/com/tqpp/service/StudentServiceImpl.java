package com.tqpp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.Dao.StudentDao;
import com.tqpp.model.Student;


@Service
public class StudentServiceImpl implements studentService {
	
	@Autowired
	private StudentDao sdao;

	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		return sdao.insertStudent(s);
	}

	@Override
	public boolean deleteStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getAllStudents() {
		return sdao.getAllStudents();
	}

	@Override
	public Student getStudentById(int id) {
		
		return sdao.getStudentById(id);
	}
	

	
}
