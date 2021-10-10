package br.com.lucasfuck.vacancy.repository;

import br.com.lucasfuck.vacancy.entity.Correlation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrelationRepository extends JpaRepository<Correlation, Long> {

}
