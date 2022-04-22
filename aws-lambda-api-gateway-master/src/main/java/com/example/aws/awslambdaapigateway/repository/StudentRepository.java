package com.example.aws.awslambdaapigateway.repository;

import com.example.aws.awslambdaapigateway.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {

    public List<Student> studentList(){
        return Arrays.asList(
                new Student(1,"Tom",25),
                new Student(2,"John",18),
                new Student(3,"Ryan",22)
        );
    }
}
