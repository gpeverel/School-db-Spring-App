package com.example.school.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cabinet")
public class Cabinet
{

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  number;

	@Column(name = "floor")
	private int floor;

	@Column(name = "desks_number")
	private int couples;

	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private Schedule scheduleId;


}
