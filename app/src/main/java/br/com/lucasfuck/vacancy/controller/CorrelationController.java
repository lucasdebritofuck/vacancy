package br.com.lucasfuck.vacancy.controller;

import br.com.lucasfuck.dto.CorrelationDTO;
import br.com.lucasfuck.dto.PersonCorrelationDTO;
import br.com.lucasfuck.port.input.CorrelationInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/correlation")
public class CorrelationController {

    private final CorrelationInputPort correlationInputPort;

    @Autowired
    public CorrelationController(CorrelationInputPort correlationInputPort) {
        this.correlationInputPort = correlationInputPort;
    }

    @PostMapping
    public CorrelationDTO create(@Valid @RequestBody CorrelationDTO correlationDTO) {
        return correlationInputPort.create(correlationDTO);
    }
    
}
