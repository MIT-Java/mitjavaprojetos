package br.edu.infnet.votaelberthmoraes.model.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaelberthmoraes.model.domain.Eleicao;
import br.edu.infnet.votaelberthmoraes.model.repository.EleicaoRepository;

@Service
public class EleicaoService {
	
	@Autowired
	private EleicaoRepository eleicaoRepository;

	public List<Eleicao> obterLista(){
		return (List<Eleicao>) eleicaoRepository.findAll();
	}	
	
	public void incluir(Eleicao eleicao) {
		eleicaoRepository.save(eleicao);
	}
	
	public void excluir(Integer id) {
		eleicaoRepository.deleteById(id);
	}
	
	public Eleicao obterPorId(Integer id){
		return eleicaoRepository.findById(id).orElse(null);			
	}
}