package com.example.demo.probandocarro;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.condition.ConditionMessage.ItemsBuilder;

import com.example.demo.carrito.Product;
import com.example.demo.carrito.ProductNotFoundException;
import com.example.demo.carrito.ShoppingCart;

public class ShopingCartTest {
	private ShoppingCart cart;
	private Product product;

	@BeforeEach
	public void setup() {
		cart = new ShoppingCart();
		product = new Product("Coca", 1);
		cart.addItem(product);
		product = new Product("Fanta", 1);
		cart.addItem(product);

	}

	@Test
	public void addItem() {
		Product p = new Product("Item", 2);
		cart.addItem(p);
		System.out.println(cart.getItemCount());
		assertEquals(3, cart.getItemCount());

	}

	@Test
	public void getbalancetest1() {
		assertEquals(2, cart.getBalance());
	}

	@Test
	public void getBalancetest2() {
		assertNotNull(cart.getBalance());

	}

	@Test
	public void removeitemtest() throws ProductNotFoundException {
		Product p = new Product("Alvaro", 0.1);
		assertThrows(ProductNotFoundException.class, () -> cart.removeItem(p));
	}

	@Test
	public void removeitemtestOk() throws ProductNotFoundException {
		Product p = new Product("Coca", 1);
		assertDoesNotThrow(() -> cart.removeItem(p));
	}
	
	
	@Test
	public void emptytest() {
		cart.empty();
		assertTrue(cart.isEmpty());

	}
}
