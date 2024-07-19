package com.vassili.studentsystem.service;

import com.vassili.studentsystem.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
