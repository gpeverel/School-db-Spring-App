package com.example.school.controller;


import com.example.school.models.Schedule;
import com.example.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class SchoolController
{

	@Autowired
	SchoolService schoolService;


	@GetMapping("/schedule/teacher")
	public Schedule scheduleByTeacher(
			@RequestParam String name
	) {
		return schoolService.findByTeachersName(name);
	}

	@GetMapping("/schedule/class")
	public Schedule scheduleByClass(@RequestParam String number) {

		return schoolService.findByClassNumber(number).get();
	}
}
