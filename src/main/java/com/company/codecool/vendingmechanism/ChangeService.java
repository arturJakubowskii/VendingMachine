package com.company.codecool.vendingmechanism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChangeService {

    /*
    TODO
    method that is the changeMechanism, this method should calculate the best
    change possibility and return Coin objects to Wallet
     */

    private int productPrice;
    private int coinValue;

    private Set<Integer> coinValueSet = new HashSet<>();

    public ChangeService(int productPrice, int coinValue) {
        this.productPrice = productPrice;
        this.coinValue = coinValue;
    }

    private void insertValuesToSet() {
        coinValueSet.add(10);
        coinValueSet.add(20);
        coinValueSet.add(50);
        coinValueSet.add(100);
        coinValueSet.add(200);
        coinValueSet.add(500);
    }

    public void changeController(){
        if(coinValue >= productPrice){
            System.out.println("Payment has been successful");
            changeMechanism();
        }else{
            System.out.println("Payment not accepted");
        }
    }

    private int returnCoinValueChange(){
        int coinValueChange = productPrice - coinValue;
        return Math.abs(coinValueChange);
    }

    private void changeMechanism(){
        insertValuesToSet();
        int change = returnCoinValueChange();

    }

}
