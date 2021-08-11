package com.projeto_microsservissos.Product_catalog.Repository;

import com.projeto_microsservissos.Product_catalog.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
