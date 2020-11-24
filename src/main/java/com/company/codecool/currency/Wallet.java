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

    private void checkCoinAmunt(int amount){
        if (amount == 0){
            System.out.println("Out of coins");
        }else{
            System.out.println("Coin is in the wallet");
        }
    }

    public void giveCoin(Coin coin){
        int coinValue = coin.getValue();

        switch (coinValue){
            case 10:
                checkCoinAmunt(tenGr);
                tenGr--;
                break;

            case 20:
                checkCoinAmunt(twentyGr);
                twentyGr--;
                break;

            case 50:
                checkCoinAmunt(fiftyGr);
                fiftyGr--;
                break;

            case 100:
                checkCoinAmunt(oneZl);
                oneZl--;
                break;

            case 200:
                checkCoinAmunt(twoZl);
                twoZl--;
                break;

            case 500:
                checkCoinAmunt(fiveZl);
                fiveZl--;
                break;
        }


    }
}
