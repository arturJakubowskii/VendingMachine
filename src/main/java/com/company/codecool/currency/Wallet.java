package com.company.codecool.currency;

import java.util.ArrayList;

public class Wallet {

    private int tenGr;
    private int twentyGr;
    private int fiftyGr;

    private int oneZl;
    private int twoZl;
    private int fiveZl;

    public Wallet(int tenGr, int twentyGr, int fiftyGr, int oneZl, int twoZl, int fiveZl) {
        this.tenGr = tenGr;
        this.twentyGr = twentyGr;
        this.fiftyGr = fiftyGr;
        this.oneZl = oneZl;
        this.twoZl = twoZl;
        this.fiveZl = fiveZl;
    }

    private boolean checkCoinAmount(int amount){
        if (amount == 0){
            System.out.println("Out of coins");
            return false;
        }else{
            System.out.println("Coin is in the wallet");
            return true;
        }
    }

    private int returnCoinValue(Coin coin, int amount){
        if (amount > 0){
            return coin.getValue();
        }
        System.out.println("dupa");
        return 0;
    }

    public int giveCoin(Coin coin){
        int coinValue = coin.getValue();

        switch (coinValue){
            case 10:
                if (checkCoinAmount(tenGr)){
                    tenGr--;
                    return returnCoinValue(coin, tenGr);
                }
                break;

            case 20:
                if (checkCoinAmount(twentyGr)){
                    twentyGr--;
                    return returnCoinValue(coin, twentyGr);
                }
                break;

            case 50:
                if (checkCoinAmount(fiftyGr)){
                    fiftyGr--;
                    return returnCoinValue(coin,fiftyGr);
                }
                break;

            case 100:
                if (checkCoinAmount(oneZl)){
                    oneZl--;
                    return returnCoinValue(coin,oneZl);
                }
                break;

            case 200:
                if (checkCoinAmount(twoZl)){
                    twoZl--;
                    return returnCoinValue(coin,twoZl);
                }
                break;

            case 500:
                if (checkCoinAmount(fiveZl)){
                    fiveZl--;
                    return returnCoinValue(coin,fiveZl);
                }
                break;

        }
        return 0;
    }

    public void takeChange(ArrayList<Integer> coinValues){

        for (int value : coinValues){

            System.out.println(value);

            switch (value){
                case 10:
                    tenGr++;
                    break;

                case 20:
                    twentyGr++;
                    break;

                case 50:
                    fiftyGr++;
                    break;

                case 100:
                    oneZl++;
                    break;

                case 200:
                    twoZl++;
                    break;

                case 500:
                    fiveZl++;
                    break;
            }
        }

    }

    public int getOneZl() {
        return oneZl;
    }

    public int getTenGr() {
        return tenGr;
    }

    public int getTwentyGr() {
        return twentyGr;
    }

    public int getFiftyGr() {
        return fiftyGr;
    }

    public int getTwoZl() {
        return twoZl;
    }

    public int getFiveZl() {
        return fiveZl;
    }
}
