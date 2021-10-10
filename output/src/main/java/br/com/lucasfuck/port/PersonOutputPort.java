package br.com.lucasfuck.port;

import br.com.lucasfuck.vacancy.entity.Person;

public interface PersonOutputPort {

    Person findByIdentifier(String identifier);
    void save(Person person);
    void delete(Person person);
}
