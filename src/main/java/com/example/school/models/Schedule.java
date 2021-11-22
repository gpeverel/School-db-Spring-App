package com.example.school.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
//@ToString
@Table(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_id")
	@JsonIgnore
	private Long id;

	@JsonManagedReference
	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@Fetch(FetchMode.SELECT)
	@ToString.Exclude
	private Set<Group> groups;

	@JsonManagedReference
	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ToString.Exclude
//	@Fetch(FetchMode.SELECT)
	private Set<Cabinet> cabinets;

	@JsonManagedReference
	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ToString.Exclude
	//	@Fetch(FetchMode.SELECT)
	private Set<Teacher> teachers;

	@JsonManagedReference
	@OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@ToString.Exclude
	//@Fetch(FetchMode.SELECT)
	private Set<Subject> subjects;

//	@Override
//	public boolean equals(Object o)
//	{
//		if (this == o) return true;
//		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//		Schedule schedule = (Schedule) o;
//		return schedule != null && Objects.equals(schedule, schedule.schedule);
//	}
//
//	@Override
//	public int hashCode()
//	{
//		return getClass().hashCode();
//	}
}
