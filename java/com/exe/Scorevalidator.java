package com.exe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class Scorevalidator implements ConstraintValidator<score,String> {

    List<String> scores = Arrays.asList(
            "A+","A","A-",
            "B+","B","B-",
            "C+","C","C-",
            "D+","D","D-",
            "F"
    );
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for(String string : scores){
            if(value.equals(string)) return true;
        }
        return false;
    }
}
