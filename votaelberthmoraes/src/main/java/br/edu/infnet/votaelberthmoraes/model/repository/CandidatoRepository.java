package br.edu.infnet.votaelberthmoraes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votaelberthmoraes.model.domain.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Integer> {

}
