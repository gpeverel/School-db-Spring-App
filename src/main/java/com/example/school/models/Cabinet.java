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
//@ToString
@RequiredArgsConstructor
@Table(name = "cabinet")
public class Cabinet
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "number")
	private int  number;

	@Column(name = "floor")
	private int floor;

	@Column(name = "desks_number")
	private int couples;

	@JsonBackReference
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "schedule_id")
	private Schedule schedule;

//	@Override
//	public boolean equals(Object o)
//	{
//		if (this == o) return true;
//		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//		Cabinet cabinet = (Cabinet) o;
//		return number != null && Objects.equals(number, cabinet.number);
//	}

	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}
}
