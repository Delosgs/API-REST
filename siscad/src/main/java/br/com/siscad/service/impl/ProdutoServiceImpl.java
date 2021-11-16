package br.com.siscad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscad.model.Produto;
import br.com.siscad.repository.ProdutoRepository;
import br.com.siscad.service.ProdutoService;

@Service

public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	ProdutoRepository repository;

	@Override
	public Produto create(Produto e) {
		// TODO Auto-generated method stub
		return repository.save(e);
	}

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Produto findById(Long id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Boolean delete(Long id) {
		Boolean retorno = false;
		if (repository.existsById(id)) {
			repository.deleteById(id);
			retorno = true;
		}
		return retorno;
	}

}
