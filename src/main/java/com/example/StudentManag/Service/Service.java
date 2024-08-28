package com.example.StudentManag.Service;
import java.util.List;
import com.example.StudentManag.entity.Student;

public interface Service  {

    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public void deleteById(int id);
}
