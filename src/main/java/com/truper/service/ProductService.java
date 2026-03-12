package com.truper.service;

import com.truper.entity.Product;
import com.truper.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;


    public List<Product> saveProducts(List<Product> products){

        products.forEach(product -> {
                    productRepository.save(product);
                });

        return products;
    }

    public Product updateProduct(Integer id, Product product) {
        Product productExisting = productRepository.findById(id).get();

        productExisting.setCode(product.getCode());
        productExisting.setPrice(product.getPrice());

        return productRepository.save(productExisting);
    }
}
