package com.example.demo1o.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1o.modal.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
