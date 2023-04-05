package com.pedidos.paq.rest;

import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedidos.paq.entitys.DetallePedido;
import com.pedidos.paq.entitys.Pedido;
import com.pedidos.paq.entitys.service.PedidosService;

@RestController
public class PedidosRest {
	
	@Autowired
	private PedidosService pedidosService;
	
	@PostMapping(value = "/guardaPedido",  name = "/guardaPedido")
	public String guardarPedido(@RequestBody Pedido pedido) {
		
		pedidosService.guardarPedido(pedido);
		
		return "Se ha guardado el pedido";
	}
	
	@GetMapping(value = "/informacionPedido/{id}")
	public Pedido informacionPedido(@PathVariable ("id") int id) {
		
		
		Pedido pedido= pedidosService.informacionPedido(id);
		
		return pedido;
		
		
	}

	
	
	

}
