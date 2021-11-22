package com.example.school.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
//@ToString
@RequiredArgsConstructor
@Table(name = "class")
public class Group
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "class_id")
	private int id;

	@Column(name = "number", unique = true, nullable = false, length = 10)// обязательное, незануляемое поле, размер 10
	private String  number;

	@Column(name = "number_of_students", nullable = false)
	private int numberOfStudents;

	@JsonManagedReference
	@ToString.Exclude
	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Set<Student> students;

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
//		Group group = (Group) o;
//		return classId != null && Objects.equals(classId, group.classId);
//	}
//
//	@Override
//	public int hashCode()
//	{
//		return getClass().hashCode();
//	}
}
