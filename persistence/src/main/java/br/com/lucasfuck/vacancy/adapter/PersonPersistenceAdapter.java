package br.com.lucasfuck.vacancy.adapter;

import br.com.lucasfuck.port.PersonOutputPort;
import br.com.lucasfuck.vacancy.entity.Person;
import br.com.lucasfuck.vacancy.exception.PersonNotFound;
import br.com.lucasfuck.vacancy.repository.PersonRepository;
import org.springframework.stereotype.Component;

@Component
public class PersonPersistenceAdapter implements PersonOutputPort {

    private final PersonRepository personRepository;

    public PersonPersistenceAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person findByIdentifier(String identifier) {
        Person person = personRepository.findByIdentifier(identifier);

        if (person == null)
            throw new PersonNotFound(String.format("Person with identifier %s not found", identifier));

        return person;
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(Person person) {
        personRepository.delete(person);
    }
}
