package br.com.lucasfuck.port;

import br.com.lucasfuck.vacancy.entity.Person;

public interface PersonOutputPort {

    Person findByIdentifier(String identifier);
    Person save(Person person);
    void delete(Person person);

}
