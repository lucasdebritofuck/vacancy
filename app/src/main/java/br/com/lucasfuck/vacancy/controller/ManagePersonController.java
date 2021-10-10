package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.input.ManagePerson;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
public class ManagePersonController {

    private final ManagePerson managePerson;

    public ManagePersonController(ManagePerson managePerson) {
        this.managePerson = managePerson;
    }

    @PostMapping
    public void createPerson(@Valid @RequestBody PersonDTO personDTO) {
        managePerson.create(personDTO);
    }

    @DeleteMapping
    public void removePerson(@Valid @RequestBody String identifier) {
        managePerson.remove(identifier);
    }

}
