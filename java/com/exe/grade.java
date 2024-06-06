package com.exe;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@Setter
public class grade {
    @NotBlank(message = "Name should not ne empty!")
    private String name;
    @NotBlank(message = "Subject should not be empty!")
    private String sub;
    @score(message = "Score must be a Capital letter grade!")
    private String score;
    private String id;

   public grade(String name, String sub, String score) {
        this.name = name;
       this.sub = sub;
        this.score = score;
   }

public grade(){
    this.id= UUID.randomUUID().toString();
    }

}
