package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.input.PersonInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
public class ManagePersonController {

    private final PersonInputPort personInputPort;

    @Autowired
    public ManagePersonController(PersonInputPort personInputPort) {
        this.personInputPort = personInputPort;
    }

    @PostMapping
    public PersonDTO createPerson(@Valid @RequestBody PersonDTO personDTO) {
        return personInputPort.create(personDTO);
    }

    @DeleteMapping(path = "/{identifier}")
    public void removePerson(@PathVariable("identifier") String identifier) {
        personInputPort.remove(identifier);
    }

}
