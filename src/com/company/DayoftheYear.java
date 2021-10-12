package com.company;

import java.util.Scanner;

public class DayoftheYear {
    public static void main(String[] args) {


        Scanner days = new Scanner(System.in);

        System.out.println("Please write a day of the year 2021");
        int day = days.nextInt();

        if (day >=1 && day <=31)
            System.out.println("It is January");
        if (day > 31 && day <=59)
            System.out.println("It is February");
        if (day > 59 && day <=90)
            System.out.println("It is March");
        if (day > 90 && day <=120)
            System.out.println("It is April");
        if (day > 120 && day <=151)
            System.out.println("It is May");
        if (day > 151 && day <=181)
            System.out.println("It is June");
        if (day > 181 && day <=212)
            System.out.println("It is July");
        if (day > 212 && day <=243)
            System.out.println("It is August");
        if (day > 243 && day <=273)
            System.out.println("It is September");
        if (day > 273 && day <=304)
            System.out.println("It is October");
        if (day > 304 && day <=334)
            System.out.println("It is November");
        if (day > 332 && day <=365)
            System.out.println("It is December");



    }
}
