package com.example.LPU.SpringMVCDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Scope("prototype")
public class Student {
    int rno;
    int age;
    String name;
    String branch;
    double cgpa;
    boolean isPlaced;

    public Student(int rno, int age, String name){
        this.rno = rno;
        this.age = age;
        this.name = name;
    }

}
