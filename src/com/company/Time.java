package com.company;

public class Time {

    public static void main(String[] args) {

        var time = 8;

        if (time < 12)
            System.out.println("Good morning Sunshine");

        else if (time >= 13 & time <= 19)
            System.out.println("Good Afternoon. Work hard!");

        else if (time >= 20 & time <= 24)
            System.out.println("Good evening. Get some rest");


        var timeSecond = -2;

        if (timeSecond < 12 & timeSecond > 0)
            System.out.println("Good morning Sunshine");

        else if (timeSecond >= 13 && timeSecond <= 19)
            System.out.println("Good Afternoon. Work hard!");

        else if (timeSecond >= 20 && timeSecond <= 24)
            System.out.println("Good evening. Get some rest");

        else if (timeSecond < 0)
            System.out.println("incorrect data");


        var timeThird = 100;

        if (timeThird < 12)
            System.out.println("Good morning Sunshine");

        else if (timeThird >= 13 && timeThird <= 19)
            System.out.println("Good Afternoon. Work hard!");

        else if (timeThird >= 20 && timeThird <= 24)
            System.out.println("Good evening. Get some rest");

        else if (timeThird > 24)
            System.out.println("incorrect data");
    }
}
