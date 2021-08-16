package com.dio.jon.shoppingcart.repository;

import com.dio.jon.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<Cart, Long> {
}
