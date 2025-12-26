package com.example.LPU.SpringMVCDemo.controller;

import com.example.LPU.SpringMVCDemo.SpringMvcDemoApplication;
import com.example.LPU.SpringMVCDemo.model.Student;
import com.example.LPU.SpringMVCDemo.service.StudentService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;



    @GetMapping("/")
    public List<Student> getAllStudents(){
        return service.findAll();
    }

    @PostMapping("/")
    public boolean saveStudent(@RequestBody Student req){
        System.out.println(req.toString());
        service.save(req);
        return true;
    }

    // /student/{rollNo}
    @GetMapping("/student/{rollNo}")
    public Student getStudentByrollNo( @PathVariable int rollNo) throws Exception {
        return service.getStudentByrollNo(rollNo);
    }

    @PutMapping("/student/{rollNo}")
    public boolean updateByrollNo(@PathVariable("rollNo") int rollNo, @RequestBody Student st){
        return service.updateByrollNo(rollNo, st);
    }

//    @PutMapping("/student/{name}")
//    public boolean updateByname(@PathVariable("name") String name, @RequestBody Student st){
//        return service.updateByname(name, st);
//    }





}
