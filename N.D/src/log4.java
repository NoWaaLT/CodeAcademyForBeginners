import java.util.Scanner;

public class log4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekday = sc.nextInt();
        String weekdayString;
        switch (weekday) {
            case 1:
                weekdayString = "Monday";
                break;
            case 2:
                weekdayString = "Monday";
                break;
            case 3:
                weekdayString = "Monday";
                break;
            case 4:
                weekdayString = "Monday";
                break;
            case 5:
                weekdayString = "Monday";
                break;
            case 6:
                weekdayString = "Monday";
                break;
            case 7:
                weekdayString = "Monday";
                break;
            default:
                weekdayString = "Invalid day";
                break;


        }
        System.out.println(weekdayString);
    }
}
