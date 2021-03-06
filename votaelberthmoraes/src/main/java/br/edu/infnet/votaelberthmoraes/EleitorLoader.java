package br.edu.infnet.votaelberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaelberthmoraes.model.domain.Eleitor;
import br.edu.infnet.votaelberthmoraes.model.domain.service.EleitorService;

@Component
public class EleitorLoader implements ApplicationRunner {

	@Autowired
	private EleitorService eleitorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("123");
		eleitor.setNome("Eleitor Elberth");
		eleitor.setEmail("elberth@eleitor.com");
		eleitor.setTelefone("21996016255");
		eleitor.setToken("123456");
		
		try {
			eleitorService.incluir(eleitor);
			System.out.println("[SUCESSO] Inclusão realizada!!!");
		} catch (Exception e) {
			System.out.println("[ERRO] "+ e.getMessage());
		}
	}
}