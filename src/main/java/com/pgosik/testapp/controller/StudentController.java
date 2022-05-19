package com.pgosik.testapp.controller;

import com.pgosik.testapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
@RestController
@RequestMapping(
        path="/api/students",
        produces = "application/hal+json"
)
public class StudentController {
    private StudentService service;


    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStudentByName(@PathVariable("id") Long id) {
        @PageableDefault()
    }

    @PutMapping("/{id}/grant/{marks}")
    public ResponseEntity<?> grantRole(@PathVariable("id") Long id,
                                       service.addMark(id, marks) {
        return null;
    }
}