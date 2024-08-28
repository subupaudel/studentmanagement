package com.example.StudentManag.Repository;

import com.example.StudentManag.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepo extends JpaRepository<Student, Integer> {

}
