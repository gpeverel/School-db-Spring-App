package com.example.school.repository;

import com.example.school.models.Schedule;
import com.example.school.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>
{
	Set<Schedule> findByScheduleId(long id);
}
