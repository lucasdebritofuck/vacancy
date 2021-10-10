package br.com.lucasfuck.vacancy.model.service;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.PersonOutputPort;
import br.com.lucasfuck.port.input.ManagePersonInputPort;
import br.com.lucasfuck.vacancy.entity.Person;
import br.com.lucasfuck.vacancy.model.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagePersonInputPortService implements ManagePersonInputPort {

    private final PersonMapper personMapper;
    private final PersonOutputPort personOutputPort;

    @Autowired
    public ManagePersonInputPortService(PersonMapper personMapper, PersonOutputPort personOutputPort) {
        this.personMapper = personMapper;
        this.personOutputPort = personOutputPort;
    }

    @Override
    public void create(PersonDTO personDTO) {
        personOutputPort.save(personMapper.toEntity(personDTO));
    }

    @Override
    public void remove(String identifier) {
        Person person = personOutputPort.findByIdentifier(identifier);

        if (person == null)
            return;

        personOutputPort.delete(person);
    }
}
