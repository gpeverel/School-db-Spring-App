package com.example.school.models;


import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "student")
public class Student
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "class_id")
	private Group group;
}
