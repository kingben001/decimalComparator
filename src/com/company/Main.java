package com.company;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
//        int length = String.valueOf(6).length();
//        System.out.println(length);
        boolean test = areEqualByThreeDecimalPlaces(-3.1756, -3.1759);
        System.out.println(test);

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        int firstcheck = (int) (first * 1000);
        int secondcheck = (int) (second * 1000);
        if (firstcheck - secondcheck == 0) {
            return true;
        } else {
            return false;
        }
    }
}

