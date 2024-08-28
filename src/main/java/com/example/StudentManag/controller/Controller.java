package com.example.StudentManag.controller;

import com.example.StudentManag.Service.Service;
import com.example.StudentManag.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller


public class Controller {

    @Autowired
    private Service service;
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/students")
    public String getAllStudents(Model model)
    {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

    @GetMapping("students/new")
    public String createStudentForm(Model model){

        Student student= new Student();
        model.addAttribute("students",student);

        return "createstudent";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){

        service.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteById(@PathVariable int id)
    {
        service.deleteById(id);
        return "redirect:/students";
    }
}
