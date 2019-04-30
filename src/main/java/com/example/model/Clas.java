package com.example.model;

import java.util.List;

public class Clas {
    private Integer id;

    private Byte level;

    private List<Stu> students;


    public List<Stu> getStudents() {
        return students;
    }

    public void setStudents(List<Stu> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }
}