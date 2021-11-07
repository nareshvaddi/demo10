package com.example.demo1o.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1o.modal.Student;
import com.example.demo1o.repository.StudentRepository;
import com.example.demo1o.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentrService;
	
	@GetMapping("/std")
	public List<Student> getStudentDetails()
	{
		return studentrService.getStudentDetails();
	}
	
	@PostMapping("/std")
	public Student saveStudentDetails(@RequestBody Student std)
	{
		return studentrService.getStudentDetails(std);
	}
	
	@DeleteMapping("/std")
	public Student deleteStudentDetails(@RequestBody Student std)
	{
		return studentrService.getStudentDetails(std);
	}
	
	@PutMapping("/std")
	public Student updateStudentDetails(@RequestBody Student std)
	{
		return studentrService.getStudentDetails(std);
	}
	
	//@GetMapping("/findbyfirstname/{Salary}")
	//public List<Student>getStudentDetailsBasedOnFirstname(@PathVariable(Salary)double salary){
	//	return  studentrService.getStudentDetailsBasedOnDoubleSalary(salary);
//	}
	
	//@DeleteMapping("/findbyfirstname/{fname}")
	//public List<Student>getStudentDetailsBaseOnFirstname(@PathVariable(Fname) String(Fname){
	//	return studentrService.getStudentDetailsBaseOnFirstname(Fname);
	}


