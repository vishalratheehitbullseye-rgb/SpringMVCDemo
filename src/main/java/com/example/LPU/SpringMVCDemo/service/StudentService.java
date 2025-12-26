package com.example.LPU.SpringMVCDemo.service;

import com.example.LPU.SpringMVCDemo.model.Student;
import com.example.LPU.SpringMVCDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        Student st1 = new Student(1, 21, "Vishal");
        Student st2 = new Student(2, 22, "Vikram");
        Student st3 = new Student(3, 21, "Shivam");
        Student st4 = new Student(4, 22, "Shreya");
        list.add(st1);list.add(st2);list.add(st3);list.add(st4);
        return list;
    }

    public void save(Student req) {
        repo.save(req);
    }

    public Student getStudentByrollNo(int rollNo) throws Exception {
        return repo.getStudentByrollNo(rollNo);
    }

    public boolean updateByrollNo(int rollNo, Student st) {
        return repo.updateByrollNo(rollNo, st);
    }

    public boolean updateByname(String name,  Student st) {
        return repo.updateByname(name, st);
    }
}
