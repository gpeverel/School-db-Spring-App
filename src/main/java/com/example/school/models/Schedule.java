package com.example.school.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleId;

	@OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Group> groups;

	@OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Cabinet> cabinetList;

	@OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Teacher> teachers;

	@OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Subject> subjects;
}
