package com.melihgencturk.ecommerceapp.repository;



import com.melihgencturk.ecommerceapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    //custom queries


}
