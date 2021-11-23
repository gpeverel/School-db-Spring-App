package com.example.school.service;


import com.example.school.models.Group;
import com.example.school.models.Schedule;
import com.example.school.models.Teacher;
import com.example.school.repository.ClassRepository;
import com.example.school.repository.ScheduleRepository;
import com.example.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SchoolService {
	private final ScheduleRepository schoolRepo;
	private final TeacherRepository teacherRepo;
	private final ClassRepository   classRepo;

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

	public Optional<Schedule> findByClassNumber(String number)
	{
		Group group = classRepo.findByNumber(number);
		return schoolRepo.findById(group.getSchedule().getId());
	}
}
