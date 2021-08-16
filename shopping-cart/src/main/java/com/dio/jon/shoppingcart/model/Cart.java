package com.dio.jon.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Getter
@Setter
@RedisHash("cart")
public class Cart {

    @Id
    private  Long id;

    private List<Item> items;
}