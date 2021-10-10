package br.com.lucasfuck.port.input;

import br.com.lucasfuck.dto.PersonDTO;

public interface ManagePerson {

    void create(PersonDTO personDTO);

    void remove(String identifier);

}
