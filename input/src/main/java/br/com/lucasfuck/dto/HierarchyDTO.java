package br.com.lucasfuck.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
public class HierarchyDTO {

    @NotBlank private String childIdentifier;
    private String parentIdentifier;
}
