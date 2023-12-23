package com.sikku.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.product.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
