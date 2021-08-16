package com.dio.jon.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;


@Getter
@Setter
@RedisHash("item")
public class Item {

    private  Long productid;

    private  Integer amount;
}
