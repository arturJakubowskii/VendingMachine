package com.company.codecool.vendingmechanism;

import com.company.codecool.currency.Coin;
import com.company.codecool.product.Product;

public class PaymentService {

    private int productPrice = 0;
    private int coinValue = 0;
    Coin coin;
    Product product;


    public void readProductPrice(Product product){
        productPrice = product.getPrice();
    }

    public void readCoinValue(int value){
        coinValue += value;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getCoinValue(){
        return coinValue;
    }

}
