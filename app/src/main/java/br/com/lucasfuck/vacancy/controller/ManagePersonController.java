package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.input.ManagePersonInputPort;
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

    private final ManagePersonInputPort managePersonInputPort;

    public ManagePersonController(ManagePersonInputPort managePersonInputPort) {
        this.managePersonInputPort = managePersonInputPort;
    }

    @PostMapping
    public void createPerson(@Valid @RequestBody PersonDTO personDTO) {
        managePersonInputPort.create(personDTO);
    }

    @DeleteMapping(path = "/{identifier}")
    public void removePerson(@PathVariable("identifier") String identifier) {
        managePersonInputPort.remove(identifier);
    }

}
