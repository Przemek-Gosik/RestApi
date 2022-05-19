package com.pgosik.testapp.dto.mapper;

import com.pgosik.testapp.dto.StudentRequestDTO;
import com.pgosik.testapp.model.Student;

public class StudentMapper {
    public StudentResponseDTO toStudentResponseDTO(Student student) {
        return new StudentResponseDTO(
                student.getName(),
                student.getSurname(),
                student.getMarks()


        );
    }

    public Student fromStudentRequestDTO(StudentRequestDTO student) {
        return new Student(
                student.getName(),
                student.getSurname(),
                student.getMarks()


        );
    }
}
