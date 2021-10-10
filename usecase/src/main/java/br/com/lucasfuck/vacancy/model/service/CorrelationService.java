package br.com.lucasfuck.vacancy.model.service;

import br.com.lucasfuck.dto.CorrelationDTO;
import br.com.lucasfuck.port.CorrelationOutputPort;
import br.com.lucasfuck.port.input.CorrelationInputPort;
import br.com.lucasfuck.vacancy.entity.Correlation;
import br.com.lucasfuck.vacancy.model.mapper.CorrelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorrelationService implements CorrelationInputPort {

    private final CorrelationOutputPort correlationOutputPort;
    private final CorrelationMapper correlationMapper;

    @Autowired
    public CorrelationService(CorrelationMapper correlationMapper, CorrelationOutputPort correlationOutputPort) {
        this.correlationOutputPort = correlationOutputPort;
        this.correlationMapper = correlationMapper;
    }

    @Override
    public CorrelationDTO create(CorrelationDTO correlationDTO) {
        Correlation correlation = correlationMapper.toEntity(correlationDTO);
        correlation = correlationOutputPort.save(correlation);
        return correlationMapper.toDto(correlation);
    }

}
