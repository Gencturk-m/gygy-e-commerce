package com.melihgencturk.ecommerceapp.business.abstracts;



import com.melihgencturk.ecommerceapp.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
    Product add(Product product);
    Product update(int id, Product product);
    void delete(int id);
}
