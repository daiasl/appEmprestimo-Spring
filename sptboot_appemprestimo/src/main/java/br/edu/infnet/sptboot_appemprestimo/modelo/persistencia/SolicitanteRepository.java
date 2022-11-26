package br.edu.infnet.sptboot_appemprestimo.modelo.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.sptboot_appemprestimo.modelo.entidade.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Long>{

}
