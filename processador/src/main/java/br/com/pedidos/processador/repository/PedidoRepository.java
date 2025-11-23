package br.com.pedidos.processador.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pedidos.processador.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
