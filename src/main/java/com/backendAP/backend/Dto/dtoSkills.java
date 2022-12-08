
package com.backendAP.backend.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Setter @Getter 
public class dtoSkills {

    @NotBlank
    private String name;
    @NotBlank
    private String progress;
    
    public dtoSkills() {
    }

    public dtoSkills(String name, String progress) {
        this.name = name;
        this.progress = progress;
    }
     
}