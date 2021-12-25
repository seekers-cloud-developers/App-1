package com.devops.app.App1.controller;

import com.devops.app.App1.db.DataBase;
import com.devops.app.App1.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping("/all")
    public ArrayList<Student> getAllStudents(){
        return DataBase.studentsDatable;
    }
}
