package com.pgosik.testapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.hateoas.server.core.Relation;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Relation(itemRelation = "Student",collectionRelation = "Students")
public class StudentRequestDTO {
    @NotBlank
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;

    @NotBlank
    private ArrayList<Integer> marks;

}
