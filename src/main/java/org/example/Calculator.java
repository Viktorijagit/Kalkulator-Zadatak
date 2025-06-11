package org.example;

public class Calculator {

    public int saberi(int a, int b) {
        return a + b;
    }

    public int oduzmi(int a, int b) {
        return a - b;
    }

    public int pomnozi(int a, int b) {
        return a * b;
    }

    public int podeli(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Deljenje sa nulom nije dozvoljeno.");
        }
        return a / b;
    }
}
