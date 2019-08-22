package com.inventory.demo.Service;

import com.inventory.demo.Model.Product;
import com.inventory.demo.Repository.RepositoryProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceProduct {

    final RepositoryProduct repository;
    public ServiceProduct(RepositoryProduct repository) {
        this.repository = repository;
    }



    /*----------------- Post Service ------------------*/
    public void postService(Product product) {
        repository.save(product);

    }



    /*----------------- Get Service -----------------*/

    /*---------- Finad all ---------*/
    public List<Product> getServices() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }


    /*---------- Finad By Id ---------*/
    public Product getService(String productId) {
        return repository.findById(productId).orElse(null);
    }



    /*---------- Delete Product ---------*/
    public Boolean deleteService(String productId) {
           repository.deleteById(productId);
           return true;

    }


    /*---------- Update ---------*/
    public void updateService(Product product){
        repository.save(product);
    }


    /*---------- Sold ---------*/


}

