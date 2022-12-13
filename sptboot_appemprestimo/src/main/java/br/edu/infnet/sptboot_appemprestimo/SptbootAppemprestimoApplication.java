package br.edu.infnet.sptboot_appemprestimo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.infnet.sptboot_appemprestimo.modelo.entidade.Solicitante;
import br.edu.infnet.sptboot_appemprestimo.modelo.persistencia.SolicitanteRepository;

@SpringBootApplication
public class SptbootAppemprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptbootAppemprestimoApplication.class, args);		
	}
	
	@Bean
	public CommandLineRunner run(SolicitanteRepository repo) {
//		return (args)-> {
//			Solicitante sol = new Solicitante("José Bezerra", "rua x");
//			repo.save(sol);
//		};
		
		return (args)-> {
			List<Solicitante> sol = repo.findByNome("José Bezerra");
			System.out.println(sol.size());
		};
	}
	
}
