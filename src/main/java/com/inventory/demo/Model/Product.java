package com.inventory.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Product" )
public class Product {
    @Id
    private String ProductId;
    @Column
    private String ProductName;
    @Column
    private int ProductQuantity;
    @Column
    private int PurchasePrice;
    @Column
    private int SalePrice;
    @Column
    private int Profit;
    @Column
    private int Sold;
    @Column
    private int Remaining;

    public String getProductId() {
        return ProductId;
    }
    public void setProductId(String productId) {
        this.ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.ProductQuantity = productQuantity;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }
    public void setPurchasePrice(int purchasePrice) {
        this.PurchasePrice = purchasePrice;
    }

    public int getSalePrice() {
        return SalePrice;
    }
    public void setSalePrice(int salePrice) {
        this.SalePrice = salePrice;
    }

    public int getProfit() { return Profit; }
    public void setProfit() {
        int sum;
        sum = this.SalePrice - this.PurchasePrice;
        Profit = sum * this.Sold;
    }
    public int getSold() { return Sold; }
    public void setSold(int sold) {Sold = sold; }

    public int getRemaining() { return Remaining; }
    public void setRemaining(int remaining) { Remaining = this.ProductQuantity - this.Sold; }
}
