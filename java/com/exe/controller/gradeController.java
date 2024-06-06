package com.exe.controller;

import com.exe.constants;
import com.exe.grade;
import com.exe.repository.gradeRepository;
import com.exe.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class gradeController {

    @Autowired
    service service;

    @GetMapping("/")
    public String gradeForm(Model model,@RequestParam(required = false) String id) {
        model.addAttribute("grade",service.getGradeById(id));
        return "form";
    }
    @GetMapping("/grade")
    public String getGrades(Model model){
        model.addAttribute("grade",service.grades());
        return "grade";
    }

    @PostMapping("/handlesubmit")
    public String submitForm(@Valid grade grade, BindingResult result) {
        if (result.hasErrors()) return "form";
        service.submitgrade(grade);
        return "redirect:/grade";
    }

}
