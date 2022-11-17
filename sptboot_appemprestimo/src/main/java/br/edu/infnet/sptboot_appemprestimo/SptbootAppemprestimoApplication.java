package br.edu.infnet.sptboot_appemprestimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SptbootAppemprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptbootAppemprestimoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ClienteRepository repo) {
		return (args)-> {
			List<Cliente> clientes = repo.findByEndereco("rua a");
			System.out.println(clientes.size());
		}
	}
	
}
