package com.example.school.service;


import com.example.school.models.Schedule;
import com.example.school.models.Teacher;
import com.example.school.repository.ScheduleRepository;
import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SchoolService {
	private final ScheduleRepository schoolRepo;
	private final TeacherRepository teacherRepo;

	public Schedule findByTeachersName(String name) {

//		Teacher teacher = teacherRepo.findTeachersByFullName(name);
//		System.out.println(teacher.toString());
//		return schoolRepo.findAllByTeachers(teacher);
		Teacher teacher = teacherRepo.findByFullName(name);
		System.out.println(teacher.toString());
		System.out.println(teacher.getSchedule().getId());
		Schedule schedule = teacher.getSchedule();
		System.out.println("schedule = " + schedule.toString());
//		return schoolRepo.findAllById(teacher.getSchedule().getId());
		return schoolRepo.findAllById(schedule.getId());

	}

	public Schedule findByClassNumber(int number) {
		return schoolRepo.findAllByGroups(number);
	}
}
