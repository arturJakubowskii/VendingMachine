package com.company.codecool.vendingmechanism;

public class ChangeService {

    /*
    TODO
    method that is the changeMechanism, this method should calculate the best
    change possibility and return Coin objects to Wallet
     */

    private int productPrice;
    private int coinValue;

    private int coinValueChange = 0;

    public ChangeService(int productPrice, int coinValue) {
        this.productPrice = productPrice;
        this.coinValue = coinValue;
    }

    public void changeController(){
        if(coinValue >= productPrice){
            System.out.println("Payment has been successful");
        }else{                                               // I should add more to this method for example
            System.out.println("Payment not accepted");     // returning change
        }
    }

    private int returnCoinValueChange(){
        return coinValueChange = productPrice - coinValue;
    }
}
