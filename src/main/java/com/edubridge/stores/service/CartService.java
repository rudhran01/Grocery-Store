package com.edubridge.stores.service;

import java.util.List;

import com.edubridge.stores.entity.Cart;
import com.edubridge.stores.entity.Customer;

public interface CartService {

	void saveCartItems(List<Cart> cartsItems);
	void saveCart(Cart cart);
	List<Cart> getCartItemsByCustomerId(Customer customer);
	void removeCartItems(Customer customer, Long id);
	void removeCartItem(Long id);
}
