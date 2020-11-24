package com.company.codecool.currency;

public class Coin {

    private final int value;  // should provide every coin value in gr (1 zl == 100gr)

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
