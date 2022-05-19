package com.pgosik.testapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.hateoas.server.core.Relation;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Relation(itemRelation = "Student",collectionRelation = "Students")
public class StudentResponseDTO {
    private String name;
    private String surname;
    private ArrayList<Integer> marks;

}
