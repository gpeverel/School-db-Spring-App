package com.example.school.service;


import com.example.school.models.Schedule;
import com.example.school.models.Teacher;
import com.example.school.repository.ScheduleRepository;
import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SchoolService {
	private final ScheduleRepository schoolRepo;
	private final TeacherRepository teacherRepo;

	public Set<Schedule> findByTeachersName(String name) {
//		Teacher teacher = teacherRepo.findTeachersByFullName(name);
//		System.out.println(teacher.toString());
//		return schoolRepo.findAllByTeachers(teacher);
		Teacher teacher = teacherRepo.findByFullName(name);
		System.out.println(teacher.toString());
		return schoolRepo.findByScheduleId(teacher.getScheduleId().getScheduleId());
	}
}
