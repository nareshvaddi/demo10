package com.example.demo1o.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1o.modal.Student;
import com.example.demo1o.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrRepository;


	
	public  Student getStudentDetails(Student std) {
		 return studentrRepository.save(std);
	}
	
	public List<Student> getStudentDetails()
	{
		return studentrRepository.findAll();
	}
	
	
	public Student saveStudentDetails(Student std)
	{
		return studentrRepository.save(std);
	}

	public  Student updateStudentDetails(Student std)
	{
		  return studentrRepository.save(std);
	}

	//public Student deleteStudentDetails(Student std)
//	{
	//	   studentrRepository.delete(std);
	//}



}
