package com.inventory.demo.Repository;

import com.inventory.demo.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryProduct extends CrudRepository<Product, String>
{

}
