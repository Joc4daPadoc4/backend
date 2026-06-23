package br.com.tecloja.api.repository;

import br.com.tecloja.api.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidorepository extends JpaRepository<ItemPedido, Long>{}

