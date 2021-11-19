package com.example.school.models;


import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Subject")
public class Subject
{

	@Id
	@Column(name = "title", unique = true, nullable = false, length = 30)
	private String title;

	@Column(name = "number_of_years_to_study", nullable = false)
	private int NumberOfYears;




}
