package com.company.codecool.input;

import java.util.Scanner;

public class InputReader {


   public static int readInput(){
       Scanner scanner = new Scanner(System.in);
       int input = scanner.nextInt();
       scanner.close();
       return input;
   }

}
