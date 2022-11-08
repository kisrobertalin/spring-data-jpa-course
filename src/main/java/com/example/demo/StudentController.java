package com.example.demo;

import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping ("/Student")
    public String helloWorld (){
        return "Hello world!";
    }

    @GetMapping ("/Student/list")
    public List<Student> getStudent (){
        return studentRepository.findAll();
    }
}
