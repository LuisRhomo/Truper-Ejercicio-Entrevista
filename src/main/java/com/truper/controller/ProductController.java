package com.truper.controller;

import com.truper.entity.Product;
import com.truper.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/v1/product")
public class ProductController {

    private ProductService productService;

    @PostMapping
    public List<Product> saveProduct(@RequestBody List<Product> products){
        log.info(products.toString());
        return productService.saveProducts(products);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id,
                                 @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

}
