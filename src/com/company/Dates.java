package com.company;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        Scanner Dates = new Scanner(System.in);
        System.out.println("Please enter the day");

        int day = Dates.nextInt();

        if (day <= 0 || day > 31) {
            System.out.println("invalid day");
        }


        Scanner Dates1 = new Scanner(System.in);
        System.out.println("Please enter the month");

        int month = Dates1.nextInt();

        if (month <= 0 || month > 12) {
            System.out.println("invalid month");
        }


        Scanner Dates2 = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = Dates2.nextInt();

        if (year < 1) {
            System.out.println("invalid year");
        }


        Scanner Format = new Scanner(System.in);
        System.out.println("Please select the data formating with 1 or 2");
        int form = Format.nextInt();

        if (form == 1)
            System.out.println("Format will be YYYY/MM/DD");
        if (form == 2)
            System.out.println("Format will be YYYY.MM.DD");


    }
}
