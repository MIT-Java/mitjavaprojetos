package br.edu.infnet.votaelberthmoraes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaelberthmoraes.model.domain.Candidato;
import br.edu.infnet.votaelberthmoraes.model.domain.Eleicao;
import br.edu.infnet.votaelberthmoraes.model.repository.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository candidatoRepository;

	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}

	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}
	
	public List<Candidato> obterLista(){
		return (List<Candidato>) candidatoRepository.findAll();
	}

	public List<Candidato> obterLista(Eleicao eleicao){
		return (List<Candidato>) candidatoRepository.findAll();
	}
}