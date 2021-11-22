package com.example.school.models;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "teacher")
public class Teacher
{
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@ManyToOne
	@JoinColumn(name = "schedule_id", nullable = false)
	private Schedule scheduleId;

}
