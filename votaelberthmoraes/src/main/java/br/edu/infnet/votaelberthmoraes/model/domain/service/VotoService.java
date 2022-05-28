package br.edu.infnet.votaelberthmoraes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaelberthmoraes.model.domain.Voto;
import br.edu.infnet.votaelberthmoraes.model.repository.VotoRepository;

@Service
public class VotoService {
	
	@Autowired
	private VotoRepository votoRepository;

	public List<Voto> obterLista(){
		return (List<Voto>) votoRepository.findAll();
	}	

	public void incluir(Voto voto) {
		votoRepository.save(voto);
	}

	public void excluir(Integer id) {
		votoRepository.deleteById(id);
	}
}