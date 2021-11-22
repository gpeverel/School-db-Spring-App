package com.example.school.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
//@ToString
@RequiredArgsConstructor
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
//		Teacher teacher = (Teacher) o;
//		return id != null && Objects.equals(id, teacher.id);
//	}
//
	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}
}
