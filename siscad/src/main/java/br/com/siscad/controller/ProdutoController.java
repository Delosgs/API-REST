package br.com.siscad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscad.model.Produto;
import br.com.siscad.service.impl.ProdutoServiceImpl;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoServiceImpl service;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return new ResponseEntity<List<Produto>>(this.service.findAll(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto e) {
		return new ResponseEntity<Produto>(this.service.create(e), HttpStatus.OK);
	}

	@GetMapping("/findById")
	public ResponseEntity<Produto> findById(@Param("id") Long id) {
		return new ResponseEntity<Produto>(this.service.findById(id), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Boolean> delete(@Param("id") Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.OK);
	}

}
