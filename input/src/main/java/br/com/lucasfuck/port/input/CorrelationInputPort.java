package br.com.lucasfuck.port.input;

import br.com.lucasfuck.dto.CorrelationDTO;

public interface CorrelationInputPort {

    CorrelationDTO create(CorrelationDTO correlationDTO);

}
