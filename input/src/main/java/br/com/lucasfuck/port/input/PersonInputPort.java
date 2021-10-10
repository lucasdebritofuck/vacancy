package br.com.lucasfuck.port.input;

import br.com.lucasfuck.dto.PersonDTO;

public interface PersonInputPort {

    PersonDTO create(PersonDTO personDTO);
    void remove(String identifier);

}
