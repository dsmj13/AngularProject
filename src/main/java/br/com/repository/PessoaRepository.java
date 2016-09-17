package br.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.model.Pessoa;

/**
 * @author Junior
 *
 */
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

//	@Query("SELECT c FROM Pessoa c WHERE c.cpf = :pedro AND c.id = :id")
	public Pessoa findByRG(@Param("RG")Integer RG);
	public Pessoa findByCPF(@Param("CPF")Integer CPF);

	
	
	
}
