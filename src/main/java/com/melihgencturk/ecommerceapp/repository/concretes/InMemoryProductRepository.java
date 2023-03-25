package com.melihgencturk.ecommerceapp.repository.concretes;


import com.melihgencturk.ecommerceapp.entities.concretes.Product;
import com.melihgencturk.ecommerceapp.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    List<Product> products;

    public InMemoryProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "Iphone 14", 10, 30000.99, "apple's product"));
        products.add(new Product(2, "Macbook air", 10, 27000, "apple's product"));
        products.add(new Product(3, "Xbox", 5, 25000, "microsoft's product"));
        products.add(new Product(4, "PS5", 7, 17000, "sony's product"));
        products.add(new Product(5, "Dyson v15", 10, 14999.99, "dyson's product"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        return products.get(id - 1);
    }

    @Override
    public Product add(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product update(int id, Product product) {
        return products.set(id - 1, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id - 1);
    }
}
