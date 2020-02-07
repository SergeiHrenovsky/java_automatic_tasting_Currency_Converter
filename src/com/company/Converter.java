package com.company;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar( int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int rubleFromEuro = Converter.euroToRuble(2);
        int rubleFromDollar = Converter.dollarToRuble(3);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("2 euro are " + rubleFromEuro + " rubles.");
        System.out.println("3 dollars are " + rubleFromDollar + " rubles.");
    }
}
