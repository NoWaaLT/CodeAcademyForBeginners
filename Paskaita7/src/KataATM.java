/* ATM prototype
 * Vartotojas iveda suma kuria papildoma sąskaita. +
 * Vartotojo ištisai prašoma išsiimti pinigų. Sąskaitos likutis
 * nurodomas kaskart,kai prašoma išsiimti pinigų.
 * Programa baigia darbą, kai :
 * 1. Sąskaitos likutis tampa - 0.00 eur;
 * 3 kartus iš eilės yra įvedama didesnė suma, nei yra sąskaitoje. (2 k. ir sekanti suma anuliuoja 2 blogus bandymus);
 * 3. įvedamas - 0;
 * */

import java.util.Scanner;

public class KataATM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a sum of money you want to insert :");

        int balance = scn.nextInt();
        int i = 0; // Try
        int withdraw = 0;
        while (0 < balance) {
            System.out.println("Balance is : " + balance);
            System.out.println("___________________________________");
            System.out.println("Enter a sum you want to withdraw :");
            withdraw = scn.nextInt();
            if (withdraw > balance) {
                System.out.println("Balance is : " + balance);
                System.out.println("___________________________________");
                System.out.println("Enter a sum you want to withdraw :");
                i++;
                {
                    if (i == 3 || withdraw == 0) {
                        break;
                    }
                }


            } else if (withdraw <= balance) {
                i = 0;

                balance -= withdraw;
            } else if (withdraw == 0) {
                break;
            }
        }


    }
}


