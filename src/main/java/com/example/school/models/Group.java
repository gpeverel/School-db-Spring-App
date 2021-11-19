package com.example.school.models;


import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.util.Set;

@Entity
@Data
@Table(name = "Class")
public class Group
{

	@Id
	@Column(name = "number", unique = true, nullable = false, length = 10)// обязательное, незануляемое поле, размер 10
	private String  number;


	@Column(name = "number_of_students", nullable = false)
	private int numberOfStudents;

	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<Student> students;
}
