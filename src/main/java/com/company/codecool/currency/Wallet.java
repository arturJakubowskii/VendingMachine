package com.company.codecool.currency;

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

    public void giveCoin(Coin coin){
        int coinValue = coin.getValue();

        switch (coinValue){
            case 10:
                if (checkCoinAmount(tenGr)){
                    tenGr--;
                }
                break;

            case 20:
                if (checkCoinAmount(twentyGr)){
                    twentyGr--;
                }
                break;

            case 50:
                if (checkCoinAmount(fiftyGr)){
                    fiftyGr--;
                }
                break;

            case 100:
                if (checkCoinAmount(oneZl)){
                    oneZl--;
                }
                break;

            case 200:
                if (checkCoinAmount(twoZl)){
                    twoZl--;
                }
                break;

            case 500:
                if (checkCoinAmount(fiveZl)){
                    fiveZl--;
                }
                break;
        }


    }
}
