package com.inventory.demo.ViewModel;

public class VMProduct {

    private String productId;
    private String productName;
    private int productQuantity;
    private int purchasePrice;
    private int salePrice;
    private int profit;
    private int sold;
    private int remaining;



    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductId() { return productId; }


    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }


    public void setProductQuantity(int productQuantity) { this.productQuantity = productQuantity;
    }
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public int getPurchasePrice() {
        return purchasePrice;
    }


    public void setMVSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
    public int getSalePrice() {
        return salePrice;
    }

    public int getSold() { return sold; }
    public void setSold(int sold) {this.sold = sold; }

    public int getRemaining() { return remaining; }
    public void setRemaining(int remaining) { this.remaining = this.productQuantity - this.sold; }

    public int getProfit() { return profit; }
    public void setProfit() {
        int sum;
        sum = this.salePrice - this.purchasePrice;
        profit = sum * this.sold;
      }

}
