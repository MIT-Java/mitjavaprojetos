package br.edu.infnet.votaelberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaelberthmoraes.model.domain.Candidato;
import br.edu.infnet.votaelberthmoraes.model.domain.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Candidato candidato = new Candidato();
		candidato.setNome("Candidato Elberth");
		candidato.setNumero(1978);
		
		try {
			candidatoService.incluir(candidato);
			System.out.println("[SUCESSO] Inclusão realizada!!!");
		} catch (Exception e) {
			System.out.println("[ERRO] "+ e.getMessage());
		}
	}
}