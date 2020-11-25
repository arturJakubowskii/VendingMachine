package com.company.codecool;


import com.company.codecool.currency.Coin;
import com.company.codecool.currency.Wallet;
import com.company.codecool.input.InputReader;
import com.company.codecool.printing.PrintMenu;
import com.company.codecool.product.Product;
import com.company.codecool.vendingmechanism.PaymentService;

public class Main {

    public static void main(String[] args) {


        InputReader reader = new InputReader();
        PaymentService paymentService = new PaymentService();

        PrintMenu.printMainMenu();
        reader.readInput();

        switch (reader.getInput()){
            case 1:
                paymentService.readProductPrice(new Product(300));
                break;
            case 2:
                paymentService.readProductPrice(new Product(150));
                break;
            case 3:
                paymentService.readProductPrice(new Product(100));
                break;
            case 4:
                paymentService.readProductPrice(new Product(80));
                break;
        }

        System.out.println(paymentService.getProductPrice());
        //PrintMenu.printCoinMenu();



    }
}
