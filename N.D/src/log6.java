/* Write a Java program to find
the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days

*/

import java.util.Scanner;

public class log6 {
    public static void main(String[] args) {
        int month, year;
        String monthString, monthDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        year = sc.nextInt();
        System.out.println("Enter a month : ");
        month = sc.nextInt();

        switch (month) {
            case 1:
                monthString = "January";
                monthDays = "31";
                break;
            case 2:
                monthString = "February";
                monthDays = "28";
                break;
            case 3:
                monthString = "March";
                monthDays = "31";
                break;
            case 4:
                monthString = "April";
                monthDays = "30";
                break;
            case 5:
                monthString = "May";
                monthDays = "31";
                break;
            case 6:
                monthString = "June";
                monthDays = "30";
                break;
            case 7:
                monthString = "July";
                monthDays = "31";
                break;
            case 8:
                monthString = "August";
                monthDays = "31";
                break;
            case 9:
                monthString = "September";
                monthDays = "30";
                break;
            case 10:
                monthString = "October";
                monthDays = "31";
                break;
            case 11:
                monthString = "November";
                monthDays = "30";
                break;
            case 12:
                monthString = "December";
                monthDays = "31";
                break;
            default:
                monthString = "Invalid month";
                monthDays = "Invalid month";
                break;
        }

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            switch (month) {
                case 2:
                    monthDays = "29";
                    break;

            }
            System.out.println(monthString + " " + year + " has " + monthDays + " days");

        } else {
            System.out.println(monthString + " " + year + " has " + monthDays + " days");
        }
    }
}

