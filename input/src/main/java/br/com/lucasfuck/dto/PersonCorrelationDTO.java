package br.com.lucasfuck.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
public class PersonCorrelationDTO {

    @NotBlank private String identifier;
    @NotBlank private String correlation;
    private int level = 0;

}
