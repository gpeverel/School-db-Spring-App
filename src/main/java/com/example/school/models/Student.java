package com.example.school.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Student")
public class Student
{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "class_number", nullable = false)
//	private String classNumber;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "group_number")
	private Group group;
}
