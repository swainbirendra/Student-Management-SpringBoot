package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository srepo;

	public StudentServiceImpl(StudentRepository srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return srepo.findAll();
	}

	
	public Student saveStudent(Student s) {
		
		return srepo.save(s);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return srepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student stu) {
	
		return srepo.save(stu);
	}

	@Override
	public void deleteStudentById(Long id) {
		srepo.deleteById(id);
		
	}

}
