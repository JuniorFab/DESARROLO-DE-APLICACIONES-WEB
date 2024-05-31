package com.example.demo.Pedidos;

import java.time.LocalDate;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Usuarios.Usuario;

public class Pedido {
	
		private int pedido;
		private double precio;
		private EstadoDelPedido estado;
		private LocalDate fecha;
		private Usuario user;
		
		
		
		public Pedido( int pedido,double precio, EstadoDelPedido estado, LocalDate fecha, Usuario user) {
			super();
			 this.pedido = pedido;
			this.precio = precio;
			this.estado = estado;
			this.fecha = LocalDate.now();
			this.user = user;
		}
		
		
		public int getPedido() {
			return pedido;
		}
		
		public void setPedido(int pedido) {
			this.pedido = pedido;
		}
		
		public double getPrecio() {
			return precio;
		}
		
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public EstadoDelPedido getEstado() {
			return estado;
		}
		
		public void setEstado(EstadoDelPedido estado) {
			this.estado = estado;
		}
		
		public LocalDate getFecha() {
			return fecha;
		}
		
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		
		public Usuario getUser() {
			return user;
		}
		
		public void setUser(Usuario user) {
			this.user = user;
		}


		@Override
		public String toString() {
			return "Pedido [pedido=" + pedido + ", precio=" + precio + ", estado=" + estado + ", fecha=" + fecha
					+ ", user=" + user + "]";
		}
		
		

}
