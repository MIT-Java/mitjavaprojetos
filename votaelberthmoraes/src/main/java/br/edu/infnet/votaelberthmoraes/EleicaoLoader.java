package br.edu.infnet.votaelberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaelberthmoraes.model.domain.Eleicao;
import br.edu.infnet.votaelberthmoraes.model.domain.service.EleicaoService;

@Component
public class EleicaoLoader implements ApplicationRunner {

	@Autowired
	private EleicaoService eleicaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Eleicao primaria");

		try {
			eleicaoService.incluir(eleicao);
			System.out.println("[SUCESSO] Inclusão realizada!!!");
		} catch (Exception e) {
			System.out.println("[ERRO] "+ e.getMessage());
		}
	}
}