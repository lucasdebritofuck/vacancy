package br.com.lucasfuck.vacancy.model.service;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.port.input.ManagePerson;
import br.com.lucasfuck.vacancy.model.entity.Person;
import br.com.lucasfuck.vacancy.model.entity.mapper.PersonMapper;
import br.com.lucasfuck.vacancy.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagePersonService implements ManagePerson {

    private final PersonMapper personMapper;
    private final PersonRepository personRepository;

    @Autowired
    public ManagePersonService(PersonMapper personMapper, PersonRepository personRepository) {
        this.personMapper = personMapper;
        this.personRepository = personRepository;
    }

    @Override
    public void create(PersonDTO personDTO) {
        personRepository.save(personMapper.toEntity(personDTO));
    }

    @Override
    public void remove(String identifier) {
        Person person = personRepository.findByIdentifier(identifier);

        if (person == null)
            return;

        personRepository.delete(person);
    }
}
