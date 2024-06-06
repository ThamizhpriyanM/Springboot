package com.exe.service;

import com.exe.constants;
import com.exe.grade;
import com.exe.repository.gradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class service {

    @Autowired
    gradeRepository gradeRepository;

    public grade getGrade(int index){
        return gradeRepository.getGrade(index);
    }

    public void addGrade(grade grade){
         gradeRepository.addGrade(grade);
    }
    public void update(grade grade,int index){
        gradeRepository.update(grade,index);
    }
    public List<grade> grades(){
        return gradeRepository.grades();
    }
    public Integer getGradeIndex (String id){
        for (int i = 0; i< grades().size(); i++) {
            if(grades().get(i).getId().equals(id)) return i;
        }
        return constants.NOT_FOUND;
    }

    public grade getGradeById(String id){
        int index =getGradeIndex(id);
        return  index == constants.NOT_FOUND ? new grade() : getGrade(index);

    }
    public void submitgrade(grade grade){
        int index=getGradeIndex(grade.getId());

        if( index == constants.NOT_FOUND){
           addGrade(grade);
        }else {
           update(grade,index);
        }
    }
}
