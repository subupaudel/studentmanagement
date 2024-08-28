package com.example.StudentManag.ServiceImpl;

import com.example.StudentManag.Repository.StuRepo;
import com.example.StudentManag.Service.Service;
import com.example.StudentManag.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Serviceimpl implements Service {
    @Autowired
    StuRepo stuRepo;

    @Override
    public List<Student> getAllStudents()
    {
        List<Student> list =  stuRepo.findAll();
        return list;
    }
    @Override
    public Student saveStudent(Student student){
        return stuRepo.save(student);
    }
    @Override
    public void deleteById(int id){
        stuRepo.deleteById(id);
    }
}
