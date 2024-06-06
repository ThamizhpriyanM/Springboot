package com.exe.repository;

import com.exe.grade;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class gradeRepository {

    private  List<grade> studentGrades = new ArrayList<>();
    public grade getGrade(int index){
        return studentGrades.get(index);
    }

    public void addGrade(grade grade){
        studentGrades.add(grade);
    }
    public void update(grade grade,int index){
        studentGrades.set(index,grade);
    }
    public List<grade> grades(){
        return studentGrades;
    }
}
