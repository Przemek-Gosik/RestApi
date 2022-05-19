package com.pgosik.testapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false)
    private String surname;

    private ArrayList<Integer> marks = new ArrayList<Integer>();
    public Student(String name, String surname,ArrayList<Integer>marks){
        this.surname = surname;
        this.name = name;
        this.marks=marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
            return name;
        }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void addMark(int mark) {
        this.marks.add(mark);
    }
    public void deleteMark(int mark){
        this.marks.remove(mark);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}