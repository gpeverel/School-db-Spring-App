package com.example.school.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Cabinet")
public class Cabinet
{

	@Id
	@Column(name = "number", unique = true, nullable = false)// обязательное, незануляемое поле, размер 10
	private int  number;

	@Column(name = "on_which_floor_is", nullable = false)
	private int floor;

	@Column(name = "number_of_couples", nullable = false)
	private int couples;



}
