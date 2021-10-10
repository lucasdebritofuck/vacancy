package br.com.lucasfuck.vacancy.repository;

import br.com.lucasfuck.vacancy.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByIdentifier(String identifier);
}
