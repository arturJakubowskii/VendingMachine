package com.company.codecool.vendingmechanism;

import java.util.ArrayList;

public class ChangeService {


    private int productPrice;
    private int coinValue;

    private ArrayList<Integer> coinValueArray = new ArrayList<>();
    ArrayList<Integer> returnedArray = new ArrayList<>();

    public ChangeService(int productPrice, int coinValue) {
        this.productPrice = productPrice;
        this.coinValue = coinValue;
    }

    private void insertValuesToArray() {

        coinValueArray.add(500);
        coinValueArray.add(200);
        coinValueArray.add(100);
        coinValueArray.add(50);
        coinValueArray.add(20);
        coinValueArray.add(10);
    }

    public void changeController(){
        insertValuesToArray();

        if(coinValue >= productPrice){
            System.out.println("Payment has been successful");
            changeMechanism();
        }else{
            returnCoinValueChange();
            System.out.println("Payment not accepted");
        }
    }

    private int returnCoinValueChange(){
        //System.out.println(coinValue);
        int coinValueChange = productPrice - coinValue;
        return Math.abs(coinValueChange);
    }

    private void changeMechanism(){

        int change = returnCoinValueChange();
        int y;


        if (coinValueArray.contains(change)){
            returnedArray.add(change);
        }else {
            while(change != 0){
                for (int x : coinValueArray){

                    if (change - x >= 0){
                        y = x;
                        change -= x;
                        returnedArray.add(y);
                    }
                }
            }
        }
    }


}
