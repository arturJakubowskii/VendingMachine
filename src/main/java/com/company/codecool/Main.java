package com.company.codecool;


import com.company.codecool.currency.Coin;
import com.company.codecool.currency.Wallet;
import com.company.codecool.input.InputReader;
import com.company.codecool.printing.PrintMenu;
import com.company.codecool.product.Product;
import com.company.codecool.vendingmechanism.ChangeService;
import com.company.codecool.vendingmechanism.PaymentService;


public class Main {

    public static void main(String[] args) {


        InputReader reader = new InputReader();
        PaymentService paymentService = new PaymentService();
        ChangeService changeService;
        Wallet wallet = new Wallet(3,3,2,2,2,1);

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


        PrintMenu.printCoinMenu();
        reader.readInput();

        switch (reader.getInput()){
            case 1:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(10)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
            case 2:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(20)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
            case 3:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(50)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
            case 4:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(100)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
            case 5:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(200)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
            case 6:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(500)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();
                break;
        }

    }
}
