package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {
        if (a <= 0 && b <= 0) {
            return -1;
        } else if (a <= 0) {
            return b;
        } else if (b <= 0) {
            return a;
        } else {
            return Math.min(a, b);
        }
    }
}
