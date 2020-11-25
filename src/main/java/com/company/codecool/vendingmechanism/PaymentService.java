package com.company.codecool.vendingmechanism;

import com.company.codecool.currency.Coin;
import com.company.codecool.currency.Wallet;
import com.company.codecool.product.Product;

public class PaymentService {
    /*
    TODO
     method that count Coin object value and assign it somewhere for ChangeService.
     compareValues() method that compares values from Coin and Product objects.
     */


    public static int summedCoinsValue = 0;
    Coin coin;
    Product product;
    Wallet wallet = new Wallet(2,3,2,2,2,1);

    public void sumCoinsValue(Coin coin){
        summedCoinsValue = coin.getValue();
    }


}
