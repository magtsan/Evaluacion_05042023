package com.pedidos.paq.entitys;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idpedido; 
	
	@Column(name = "monto_total")
	private float monto_total;
	
	@Column(name = "usuario", length = 50)
	private String usuario;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", referencedColumnName = "idpedido")
	private List <DetallePedido> listaDetallesPedidos;


	public int getIdpedido() {
		return idpedido;
	}


	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}


	public float getMonto_total() {
		return monto_total;
	}


	public void setMonto_total(float monto_total) {
		this.monto_total = monto_total;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public List<DetallePedido> getListaDetallesPedidos() {
		return listaDetallesPedidos;
	}


	public void setListaDetallesPedidos(List<DetallePedido> listaDetallesPedidos) {
		this.listaDetallesPedidos = listaDetallesPedidos;
	}


	public Pedido(int idpedido, float monto_total, String usuario, List<DetallePedido> listaDetallesPedidos) {
		super();
		this.idpedido = idpedido;
		this.monto_total = monto_total;
		this.usuario = usuario;
		this.listaDetallesPedidos = listaDetallesPedidos;
	}


	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	

}
