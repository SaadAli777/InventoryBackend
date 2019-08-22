package com.inventory.demo.Controller;

import com.inventory.demo.Handler.HandleProduct;
import com.inventory.demo.Model.Product;
import com.inventory.demo.Service.ServiceProduct;
import com.inventory.demo.ViewModel.VMProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerProduct {

    @Autowired
    HandleProduct HProduct;
    @Autowired
    ServiceProduct serviceProduct;

    public ControllerProduct(HandleProduct handleProduct) {
        this.HProduct = handleProduct;
    }

    @PostMapping(value = "/product")
    public void AddProduct(@RequestBody VMProduct vmproduct) {
        HProduct.Post(vmproduct);
    }

    @GetMapping("/product")
    public List<Product> getProducts() {
        return serviceProduct.getServices();
    }


    @GetMapping(value = "product/{productId}")
    public Product getProduct(@PathVariable("productId") String productId) {
        return serviceProduct.getService(productId);
    }


    @DeleteMapping(value = "product/{productId}")
    public Boolean deleteProduct(@PathVariable("productId") String productId) {
        return serviceProduct.deleteService(productId);
    }



    /* -----------*/
    @PutMapping(value="product")
    public void updateProduct(@RequestBody VMProduct vmproduct) {
        HProduct.update(vmproduct);
    }

     /*-----------------------------*/



}

