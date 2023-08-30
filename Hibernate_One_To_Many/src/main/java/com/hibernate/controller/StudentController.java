package com.hibernate.controller;

import com.hibernate.entity.Cirtificate;
import com.hibernate.entity.Student;
import com.hibernate.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

@Controller
@RequestMapping("/api/student")
public class StudentController {
    StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(Student s1){
        Cirtificate c=new Cirtificate();
        c.setCourse("python full stack");
        c.setDurration("6 mounth");
        Student s=new Student();
        s.setNane("vivek");
        s.setCity("Bhopal");
        s.setEmail("vivek@gmail.com");
        s.setCirtificate(c);


        System.out.println(s.getId());
        System.out.println(s.getNane());
        System.out.println(s.getCity());
        System.out.println(s.getEmail());
        System.out.println(s.getCirtificate());
        Student s11 = studentRepository.save(s);
        return new ResponseEntity<>(s11,HttpStatus.CREATED);
    }
}
