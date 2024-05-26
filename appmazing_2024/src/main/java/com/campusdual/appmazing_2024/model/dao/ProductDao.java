package com.campusdual.appmazing_2024.model.dao;

import com.campusdual.appmazing_2024.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
