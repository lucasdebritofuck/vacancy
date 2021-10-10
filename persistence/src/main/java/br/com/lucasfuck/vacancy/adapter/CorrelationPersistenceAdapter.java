package br.com.lucasfuck.vacancy.adapter;

import br.com.lucasfuck.port.CorrelationOutputPort;
import br.com.lucasfuck.vacancy.entity.Correlation;
import br.com.lucasfuck.vacancy.repository.CorrelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorrelationPersistenceAdapter implements CorrelationOutputPort {

    private final CorrelationRepository correlationRepository;

    @Autowired
    public CorrelationPersistenceAdapter(CorrelationRepository correlationRepository) {
        this.correlationRepository = correlationRepository;
    }

    @Override
    public Correlation save(Correlation correlation) {
        return correlationRepository.save(correlation);
    }

}
