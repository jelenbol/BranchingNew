package com.company;

public class Compare {
    public static void main(String[] args) {


        short NumberOne = 5;
        short NumberTwo = 10;

        if (NumberOne >= NumberTwo) {
            System.out.println("Number One is bigger than Number Two");
        } else {
            System.out.println("Number Two is bigger than Number One");
        }


        if (NumberOne > NumberTwo) {
            System.out.println("Number One is bigger than Number Two");
        } else {
            System.out.println("Number One is smaller than Number Two");
        }


        if (NumberOne == NumberTwo) {
            System.out.println("Number One is equal Number Two");
        } else {
            System.out.println("Number One and Number Two are not equal");
        }


        if (NumberOne % 2 == 0) {
            System.out.printf("Number One is even");
        } else {
            System.out.printf("Number One is uneven");
        }
        System.out.println();


        if (NumberOne < 0 & NumberTwo < 0) {
            System.out.println("Number One and Number Two are negative");
        } else {
            System.out.println("Number One and number Two are positive");
        }


        if (NumberOne >= 0 & NumberTwo >= 0) {
            System.out.println("Both numbers are positive");
        } else {
            System.out.println("Both numbers are negative");
        }


        if (NumberOne < 100 & NumberTwo < 100) {
            System.out.println("Number One and Number Two are smaller than 100");
        } else {
            System.out.println("Both numbers are equal or bigger than 100");
        }

    }
}




