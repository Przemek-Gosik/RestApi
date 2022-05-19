package com.pgosik.testapp.repository;

import com.pgosik.testapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long>{
    Optional<Student> findById(Long id);
    boolean existsById(Long id);
    void deleteById(Long id);
}
