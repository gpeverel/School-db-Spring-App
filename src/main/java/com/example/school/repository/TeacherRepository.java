package com.example.school.repository;

import com.example.school.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long>
{
	//Teacher findTeachersByFullName(String name);
	Teacher     findByFullName(String name);
}
