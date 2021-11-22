package com.example.school.models;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Data
@Table(name = "subject")
public class Subject
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title", unique = true, nullable = false, length = 30)
	private String title;

	@Column(name = "number_of_years_to_study", nullable = false)
	private int NumberOfYears;

	@ManyToOne
	@JoinColumn(name = "schedule_id", nullable = false)
	private Schedule scheduleId;
}
