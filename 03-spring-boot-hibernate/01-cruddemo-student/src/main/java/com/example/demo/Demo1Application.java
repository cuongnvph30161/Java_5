package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return (runner) -> {
//            createStudent(studentDAO);
            readStudent(studentDAO);
        };
    }

    private void readStudent(StudentDAO studentDAO) {

    }

    private void createStudent(StudentDAO studentDAO) {
        Student student1 = new Student("Pault","Nguyen","cuong@gmail.com");
        Student student2 = new Student("Xuan","Nguyen","cuong@gmail.com");

        studentDAO.save(student1);
        studentDAO.save(student2);

    }
}
