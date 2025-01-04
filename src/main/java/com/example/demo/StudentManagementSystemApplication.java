package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
//		Student  s1=new Student("Ramesh","swain","ramesh@gmail.com");
//		srepo.save(s1);
//		
//		Student s2=new Student("Bimal","swain","bimal@gmail.com");
//		srepo.save(s2);
//		
//		Student s3=new Student("Renubala","swain","renu@gmail.com");
//		srepo.save(s3);
	}

}
