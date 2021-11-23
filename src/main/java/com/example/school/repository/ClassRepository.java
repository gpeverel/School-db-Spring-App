package com.example.school.repository;



import com.example.school.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Group, Long>
{

	Group   findByNumber(String number);


}
