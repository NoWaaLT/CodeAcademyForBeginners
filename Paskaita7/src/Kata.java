import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Write a sum of money you want to insert :");

        int firstInsertedSum = scn.nextInt();
        int withdrawSum = 0;
        int totalWithdrawSum = 0;
        int remainingSum = 0;
        while (withdrawSum < firstInsertedSum) {
            System.out.println("Balance : " + firstInsertedSum);
            System.out.println("Enter a sum to withdraw :");
            withdrawSum = scn.nextInt();
            if (firstInsertedSum == withdrawSum) {
                System.out.println("Transaction completed! Program has ended");
            } else if (withdrawSum == 0) {
                System.out.println("Program has ended");
            } else if (withdrawSum < firstInsertedSum) { // kai isemama suma yra maziau negu ideta
                totalWithdrawSum = withdrawSum; // prisilyginam total isemimo suma isemamai sumai
                remainingSum = firstInsertedSum - withdrawSum; // is idetos sumos atimam tai ka pazymejom kad atimsim
                System.out.println("Balance : " + remainingSum); // balansa rodom
                System.out.println("Enter a sum to withdraw :"); // ivedam suma kuria noresime isimti
                totalWithdrawSum = scn.nextInt() + withdrawSum; // totalas prisilygina ta ka mes dabar isiminenejame tam kas jau buvo isimta
                if (totalWithdrawSum < firstInsertedSum) { // jeigu vis dar
                    remainingSum = firstInsertedSum - totalWithdrawSum; // gaunam nauja likuti
                    System.out.println("Balance : " + remainingSum); // balansas likes
                    System.out.println("Enter a sum to withdraw :"); // rasom kad ivestu suma isimimo
                }

            }

        }

    }

}
