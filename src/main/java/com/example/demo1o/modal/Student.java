package com.example.demo1o.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
@NoArgsConstructor
@Table(name="STD")
public class Student 
{
	@Id
	@Column(name="Std_id")
	private int Stdid;
	@Column(name="firstname")
	private String fname;
	@Column(name="email")
	private String email;
	@Column(name="salary")
	private double salary;
	
}
