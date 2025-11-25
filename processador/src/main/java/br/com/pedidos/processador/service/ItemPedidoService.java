package br.com.pedidos.processador.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pedidos.processador.entity.ItemPedido;
import br.com.pedidos.processador.entity.Pedido;
import br.com.pedidos.processador.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {

	private final ItemPedidoRepository itemPedidoRepository;
	
	public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
		 this.itemPedidoRepository = itemPedidoRepository;
	}

	public List<ItemPedido> save(List<ItemPedido> itens) {
		return itemPedidoRepository.saveAll(itens);
		
	}
	
	public void save(ItemPedido item) {
		itemPedidoRepository.save(item);
	}

	public void updatedItemPedido(List<ItemPedido> itemPedidos, Pedido pedido) {
		itemPedidos.forEach(item -> {
			item.setPedido(pedido); // informando  ao item o seu pedido. 
			this.save(item);
		});
	}
	
}
