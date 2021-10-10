package br.com.lucasfuck.vacancy.model.repository;

import br.com.lucasfuck.vacancy.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByIdentifier(String identifier);
}
