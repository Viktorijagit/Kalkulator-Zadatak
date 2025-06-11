package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 12;
        int b = 3;

        System.out.println("Saberi: " + calc.saberi(a, b));
        System.out.println("Oduzmi: " + calc.oduzmi(a, b));
        System.out.println("Pomnoži: " + calc.pomnozi(a, b));
        System.out.println("Podeli: " + calc.podeli(a, b));

        try {
            System.out.println("Podeli sa nulom: " + calc.podeli(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Greška uhvaćena: " + e.getMessage());
        }
    }
}