package com.company.codecool.vendingmechanism;

import com.company.codecool.currency.Coin;
import com.company.codecool.currency.Wallet;
import com.company.codecool.input.InputReader;
import com.company.codecool.printing.PrintMenu;
import com.company.codecool.product.Product;

public class AppService {

    InputReader reader = new InputReader();
    PrintMenu printMenu = new PrintMenu();
    PaymentService paymentService = new PaymentService();
    ChangeService changeService;
    Wallet wallet = new Wallet(2, 2, 2, 2, 2, 2);

    public void run() {

        printMenu.printMainMenu();
        reader.readInput();

        switch (reader.getInput()) {
            case 1:
                paymentService.readProductPrice(new Product(40));
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

        printMenu.printCoinMenu();
        reader.readInput();

        switch (reader.getInput()) {
            case 1:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(10)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
                break;
            case 2:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(20)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
                break;
            case 3:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(50)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
                break;
            case 4:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(100)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
                break;
            case 5:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(200)));

//                System.out.println(wallet.getOneZl());
//                System.out.println(wallet.getFiftyGr());
//                System.out.println(wallet.getTenGr());

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
//                System.out.println(wallet.getOneZl());
//                System.out.println(wallet.getFiftyGr());
//                System.out.println(wallet.getTenGr());

                break;
            case 6:
                paymentService.readCoinValue(wallet.giveCoin(new Coin(500)));

                changeService = new ChangeService(paymentService.getProductPrice(), paymentService.getCoinValue());
                changeService.changeController();

                wallet.takeChange(changeService.getChangeArray());
                break;
        }
    }
}
