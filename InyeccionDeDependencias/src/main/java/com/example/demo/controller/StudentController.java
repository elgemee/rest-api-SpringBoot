package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
    	Student student1 = new Student ("1", 1, "Alexis", "Gonzalez", 7);
    	Student student2 = new Student ("2", 3, "Brayan", "Becerril", 2);
    	Student student3 = new Student ("3", 34, "Javier", "Torres", 5);
    	studentService.add(student1);
    	studentService.add(student2);
    	studentService.add(student3);


        return studentService.findById( id );
    }

}
