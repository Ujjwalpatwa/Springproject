package com.Teacherdata.repositories;

import com.Teacherdata.entities.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teacherRepo extends JpaRepository<teacher,Integer> {
}
