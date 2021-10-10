package br.com.lucasfuck.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
public class PersonDTO {

    @NotBlank private String name;
    @NotBlank private String identifier;

}
