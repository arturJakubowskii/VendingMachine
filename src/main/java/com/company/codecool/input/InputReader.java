package com.company.codecool.input;

import java.util.Scanner;

public class InputReader {

    /*
 TODO
  main class for control the VendingMachine e.g
  uses InputReader to read input (user choice for product and coins)
  and then process it to PaymentService
  */


   public static int readInput(){
       Scanner scanner = new Scanner(System.in);
       int input = scanner.nextInt();
       scanner.close();
       return input;
   }



}
