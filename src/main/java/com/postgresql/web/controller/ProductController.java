package com.postgresql.web.controller;

import com.postgresql.domain.Product;
import com.postgresql.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("all")
    public List<Product> getAll() {
        return productoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId) {
        return productoService.getProduct(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId) {
        return productoService.getByCategory(categoryId);
    }

    @PostMapping("/save")
    public Product save(@RequestBody() Product product) {
        return productoService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productoService.delete(productId);
    }


}
