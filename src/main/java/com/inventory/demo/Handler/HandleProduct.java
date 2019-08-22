package com.inventory.demo.Handler;

import com.inventory.demo.Model.Product;
import com.inventory.demo.Service.ServiceProduct;
import com.inventory.demo.ViewModel.VMProduct;
import org.aspectj.asm.AsmManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class HandleProduct {

    /*------------- Post Method ---------------------*/
    @Autowired
    ServiceProduct service;
        public void  Post(VMProduct Object)
        {
            Product product = new Product();

            product.setProductId(Object.getProductId());
            product.setProductName(Object.getProductName());
            product.setProductQuantity(Object.getProductQuantity());
            product.setPurchasePrice(Object.getPurchasePrice());
            product.setSalePrice(Object.getSalePrice());
            service.postService(product);
        }
    /*---------------------------------------------*/

    public void  update(VMProduct Object)
    {
        Product product = new Product();

        product.setProductId(Object.getProductId());
        product.setProductName(Object.getProductName());
        product.setProductQuantity(Object.getProductQuantity());
        product.setPurchasePrice(Object.getPurchasePrice());
        product.setSalePrice(Object.getSalePrice());
        product.setSold(Object.getSold());
        product.setRemaining(Object.getRemaining());
        product.setProfit();
        service.updateService(product);
    }


}
