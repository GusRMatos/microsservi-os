package com.projeto_microsservissos.Product_catalog.Controller;

import com.projeto_microsservissos.Product_catalog.Model.Product;
import com.projeto_microsservissos.Product_catalog.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }

}
