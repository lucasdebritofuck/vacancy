package br.com.lucasfuck.vacancy.model.service;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.PersonOutputPort;
import br.com.lucasfuck.port.input.PersonInputPort;
import br.com.lucasfuck.vacancy.entity.Person;
import br.com.lucasfuck.vacancy.model.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements PersonInputPort {

    private final PersonMapper personMapper;
    private final PersonOutputPort personOutputPort;

    @Autowired
    public PersonService(PersonMapper personMapper, PersonOutputPort personOutputPort) {
        this.personMapper = personMapper;
        this.personOutputPort = personOutputPort;
    }

    @Override
    public PersonDTO create(PersonDTO personDTO) {
        Person person = personOutputPort.save(personMapper.toEntity(personDTO));
        return personMapper.toDto(person);
    }

    @Override
    public void remove(String identifier) {
        Person person = personOutputPort.findByIdentifier(identifier);

        if (person == null)
            return;

        personOutputPort.delete(person);
    }
}
