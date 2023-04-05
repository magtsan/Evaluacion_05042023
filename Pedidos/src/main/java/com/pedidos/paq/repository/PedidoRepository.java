package com.pedidos.paq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedidos.paq.entitys.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
