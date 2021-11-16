package br.com.siscad.service;

import java.util.List;

import br.com.siscad.model.Produto;

public interface ProdutoService {

	/*
	 * Cadastra um novo Produto.
	 * 
	 * @param Produto, O Produto que será criado.
	 * 
	 * 
	 * @return A Produto que foi cadastrada.
	 * 
	 * @throws Se existir uma Produto com o mesmo nome retorna uma mensagem de erro.
	 * 
	 */

	public Produto create(Produto e);

	/*
	 * Listar todas as Produtos
	 * 
	 * @return A lista de todos as Produto.
	 * 
	 */
	public List<Produto> findAll();

	/*
	 * Pesquisa uma Produto pelo ID.
	 * 
	 * @param id, O ID da Produto que será pesquisado.
	 * 
	 * @return A Produto que foi pesquisada.
	 * 
	 */

	public Produto findById(Long id);

	/*
	 * Excluir um Produto pelo ID
	 * 
	 * @param ID, Identificador do Produto que será deletado.
	 * 
	 * @return Um boolean confirmando que foi excluido.
	 */
	public Boolean delete(Long id);

}
