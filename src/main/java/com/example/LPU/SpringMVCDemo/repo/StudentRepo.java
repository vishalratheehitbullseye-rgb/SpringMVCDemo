package com.example.LPU.SpringMVCDemo.repo;

import com.example.LPU.SpringMVCDemo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentRepo {
    List<Student> data;
    StudentRepo(){
        data = new ArrayList<>();
    }

    public void save(Student req) {
        data.add(req);
    }

    public Student getStudentByrollNo(int rollNo) throws Exception {

        Optional<Student> st = data.stream().
                filter((s) -> s.getRno() == rollNo).
                findFirst();

        if(!st.isPresent()) throw new Exception("Student Not found");
        return st.get();

    }

    public boolean updateByrollNo(int rollNo, Student st) {
        for(int i = 0; i<data.size(); i++){
            if(data.get(i).getRno() == rollNo)
                data.set(i, st);
        }
        return true;
    }

    public boolean updateByname(String name,  Student st) {
        for(int i = 0; i<data.size(); i++){
            if(data.get(i).getName() == name)
                data.set(i, st);
        }
        return true;
    }
}
