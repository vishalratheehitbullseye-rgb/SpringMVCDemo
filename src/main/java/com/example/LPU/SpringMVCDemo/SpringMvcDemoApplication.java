package com.example.LPU.SpringMVCDemo;

import com.example.LPU.SpringMVCDemo.controller.StudentController;
import com.example.LPU.SpringMVCDemo.model.Student;
//import com.example.LPU.SpringMVCDemo.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class SpringMvcDemoApplication {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context =
				SpringApplication.run(SpringMvcDemoApplication.class, args);

		Student st1 = context.getBean(Student.class);
		st1.setName("Vishal");
		System.out.println(st1.getName());

		StudentController controller = context.getBean(StudentController.class);
		controller.getAllStudents();

//		StudentRepo sr = context.getBean(StudentRepo.class);
//		sr.save();

	}

}
