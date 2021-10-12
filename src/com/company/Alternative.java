package com.company;

import java.util.Scanner;

public class Alternative {

    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        {
            System.out.println("Please write month:");
            int month = date.nextInt();

            System.out.println("Please write year:");
            int year = date.nextInt();


            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println("Number of days are 31");
            else if ((month == 2) && (year % 4 == 0) || (year % 400==0))
                System.out.println("Number of days are 29");

                else if (month == 2)
                    System.out.println("Number of days are 28");

                else
                    System.out.println("Number of days are 30");
            }

    }
}
