package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Pessoa;
import br.com.repository.PessoaRepository;

@Service
public class PessoaService implements PessoaRepository {

	@Autowired
	public PessoaRepository pessoaRepository;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pessoa arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Pessoa> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Pessoa> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pessoa> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pessoa> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa findByRG(Integer RG) {
		// TODO Auto-generated method stub
		return null;
	}
        
	@Override
	public Pessoa findByCPF(Integer CPF) {
		// TODO Auto-generated method stub
		return null;
	}

		
}