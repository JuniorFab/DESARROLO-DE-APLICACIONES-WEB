package com.example.demo.ServicioPedidos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Pedidos.Pedido;
import com.example.demo.Usuarios.Usuario;

import org.springframework.stereotype.Service;
@Service
public class ServicioPedidos {
	
		
	
	private List<Pedido> pedidos=new ArrayList<>(); 
	
	public ServicioPedidos() {
		Usuario a= new Usuario(1L, "Juan", "David", 123345465L, "Que onda");
		
		pedidos.add(new Pedido(1, 30.00, EstadoDelPedido.CREADO, LocalDate.now(), a));
		
	}
	
	
	public List<Pedido> getUser() {
		return new ArrayList<Pedido>(pedidos);

	}

	
	public Pedido Buscarpedido(Long id) {
			for (Pedido pedido : pedidos) {
				if(pedido.getPedido()==id) {
					
					return pedido;
				}
			}
			return null;
	
	}
	
	 public boolean crearPedido(Pedido nuevoPedido) {
		 return pedidos.add(nuevoPedido);
	    }
	
	public  List<Pedido> Verlista(){
		return pedidos;
		
	}

}
