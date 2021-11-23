package com.example.school.repository;

import com.example.school.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Set;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>
{
//	Set<Schedule> findByScheduleId(long id);
	Set<Schedule> findAllById(long id);
//	@Query(value = "SELECT Schedule from Schedule join Subject on Schedule.id = Subject where ")
	Schedule findAllById(Long id);
	Schedule findById(int number);

}
