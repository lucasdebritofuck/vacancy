package br.com.lucasfuck.vacancy.model.entity.mapper;

import br.com.lucasfuck.dto.PersonDTO;
import br.com.lucasfuck.dto.mapper.Mapper;
import br.com.lucasfuck.vacancy.model.entity.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper implements Mapper<Person, PersonDTO> {

    @Override
    public Person toEntity(PersonDTO dto) {
        Person person = new Person();
        person.setIdentifier(dto.getIdentifier());
        person.setName(dto.getName());
        return person;
    }

    @Override
    public PersonDTO toDto(Person entity) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setIdentifier(entity.getIdentifier());
        personDTO.setName(entity.getName());
        return personDTO;
    }
}
