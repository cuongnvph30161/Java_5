package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudenRestController {
    private List<Student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Cuong","Nguyen"));
        theStudents.add(new Student("Ha","Luong"));
        theStudents.add(new Student("Trang","Ta"));
    }
    @GetMapping("/students")
    public List<Student> getListStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if(studentId >= theStudents.size() || studentId<0){
            throw new StudentNotFounException("Student id not foud"+ studentId);
        }
        return theStudents.get(studentId);
    }

 // Add an exception handler using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFounException exc){
//        StudentErrorResponse error = new StudentErrorResponse();
//         error.setStatus(HttpStatus.NOT_FOUND.value());
//         error.setMessage(exc.getMessage());
//         error.setTimeStamp(System.currentTimeMillis());
//         return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
//    }
//
//   // Add an exception handler using @Exception All
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
//        StudentErrorResponse error = new StudentErrorResponse();
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
//    }
}
