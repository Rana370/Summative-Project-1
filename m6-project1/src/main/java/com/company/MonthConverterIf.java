package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(("Please enter a month between 1-12: "));
        String user = myScanner.nextLine();

        int usermonth = Integer.parseInt(user);

        if (usermonth == 1){
            System.out.println("January");
        }else if (usermonth == 2){
            System.out.println("February");
        }else if (usermonth == 3){
            System.out.println("March");
        }else if (usermonth == 4){
            System.out.println("April");
        }else if (usermonth == 5) {
            System.out.println("May");
        }else if (usermonth == 6) {
            System.out.println("June");
        }else if (usermonth == 7) {
            System.out.println("July");
        }else if (usermonth == 8) {
            System.out.println("August");
        }else if (usermonth == 9) {
            System.out.println("September");
        }else if (usermonth == 10) {
            System.out.println("October");
        }else if (usermonth == 11) {
            System.out.println("November");
        }else if (usermonth == 12) {
            System.out.println("December");

        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye. ");
        }

    }
}
