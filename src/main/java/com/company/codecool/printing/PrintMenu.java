package com.company.codecool.printing;

public class PrintMenu {

    public void printMainMenu(){
        System.out.println(
                "Food vending machine" + "\n" + "\n"
                        + "Our products:  "
                        + "1.Sandwich: 0.4zl | 2.Cola: 1.50zl | 3.Candy: bar 1zl | 4.Water: 80gr" + "\n" + "\n"
                        + "Please choose your product: " + "\n"
        );
    }

    public void printCoinMenu(){
        System.out.println("Your Coins, enter option for coin input:" + "\n" +"\n"
                + "1. 10gr" +"\n"
                + "2. 20gr" +"\n"
                + "3. 50gr" +"\n"
                + "4. 1zl" +"\n"
                + "5. 2zl" +"\n"
                + "6. 5zl" +"\n");
    }
}
