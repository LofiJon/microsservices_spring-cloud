package com.dio.jon.productcatalog.repository;

import com.dio.jon.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
