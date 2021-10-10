package br.com.lucasfuck.vacancy.model.mapper;

import br.com.lucasfuck.dto.CorrelationDTO;
import br.com.lucasfuck.dto.mapper.Mapper;
import br.com.lucasfuck.vacancy.entity.Correlation;
import org.springframework.stereotype.Component;

@Component
public class CorrelationMapper implements Mapper<Correlation, CorrelationDTO> {

    @Override
    public Correlation toEntity(CorrelationDTO dto) {
        Correlation correlation = new Correlation();
        correlation.setName(dto.getName());
        return correlation;
    }

    @Override
    public CorrelationDTO toDto(Correlation entity) {
        CorrelationDTO correlationDTO = new CorrelationDTO();
        correlationDTO.setName(entity.getName());
        return correlationDTO;
    }
}
