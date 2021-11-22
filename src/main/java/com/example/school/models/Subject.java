package com.example.school.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
//@AllArgsConstructor
//@ToString
@RequiredArgsConstructor
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

	@JsonBackReference
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "schedule_id", nullable = false)
	private Schedule schedule;

//	@Override
//	public boolean equals(Object o)
//	{
//		if (this == o) return true;
//		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//		Subject subject = (Subject) o;
//		return id != null && Objects.equals(id, subject.id);
//	}
//
	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}

	public Subject(String title)
	{
		this.title = title;
	}
}
