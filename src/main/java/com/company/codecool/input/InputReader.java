package com.company.codecool.input;

import java.util.Scanner;

public class InputReader {

    private int input = 0;

    public void readInput(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        scanner.close();
    }

    public int getInput() {
        return input;
    }
}
