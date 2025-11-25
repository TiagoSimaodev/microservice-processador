package br.com.pedidos.processador.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pedidos.processador.entity.ItemPedido;
import br.com.pedidos.processador.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	

	public void save(List<ItemPedido> itens) {
		
		itens.forEach(item -> {produtoRepository.save(item.getProduto()); });
		
	}
	
}
