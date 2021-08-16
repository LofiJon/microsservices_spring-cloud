package com.dio.jon.shoppingcart.controller;

import com.dio.jon.shoppingcart.model.Cart;
import com.dio.jon.shoppingcart.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @PostMapping
    public Cart create(@RequestBody Cart cart ) {
        return shoppingCartRepository.save(cart);
    }

    @GetMapping
    public Iterable<Cart> list() {
        return shoppingCartRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cart> findById(@PathVariable Long id) {
        return shoppingCartRepository.findById(id);
    }
}
