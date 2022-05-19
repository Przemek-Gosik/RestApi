package com.pgosik.testapp.service;

import com.pgosik.testapp.dto.StudentResponseDTO;
import com.pgosik.testapp.dto.mapper.StudentMapper;
import com.pgosik.testapp.model.Student;

import com.pgosik.testapp.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class StudentService {
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Transactional
    public StudentResponseDTO get (Long id){
        Student student = getById(id);
        return studentMapper.toStudentResponseDTO(student);
    }
    @Transactional
    public Page<StudentResponseDTO> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable)
                .map(studentMapper::toStudentResponseDTO);
    }

    @Transactional
    public StudentResponseDTO create(StudentRequestDTO userRequestDTO) {
        Student student = studentMapper.fromUserRequestDTO(userRequestDTO);
        student = studentRepository.save(student);
        return studentMapper.toStudentResponseDTO(student);
    }

    @Transactional
    public void addMark(Long id, int mark){
        Student student = getById(id);
        student.addMark(mark);
        studentRepository.save(student);
    }

    private Student getById(Long id){
        return studentRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                String.format("User was not found for Id=%s", id)
        ));;

    }
}
