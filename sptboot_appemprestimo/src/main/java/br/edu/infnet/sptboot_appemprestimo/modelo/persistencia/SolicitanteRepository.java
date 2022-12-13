package br.edu.infnet.sptboot_appemprestimo.modelo.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.sptboot_appemprestimo.modelo.entidade.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Long>{
	List<Solicitante> findByNome(String nome);
}
