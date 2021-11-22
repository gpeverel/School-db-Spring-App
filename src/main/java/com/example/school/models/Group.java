package com.example.school.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "class")
public class Group
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;

	@Column(name = "number", unique = true, nullable = false, length = 10)// обязательное, незануляемое поле, размер 10
	private String  number;


	@Column(name = "number_of_students", nullable = false)
	private int numberOfStudents;

	@OneToMany(mappedBy = "group", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	Set<Student> students;

	@ManyToOne
	@JoinColumn(name = "schedule_id", nullable = false)
	private Schedule scheduleId;
}
