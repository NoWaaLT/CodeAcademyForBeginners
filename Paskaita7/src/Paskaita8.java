import java.util.Scanner;

public class Paskaita8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Papildykit saskaita");
        float likutis = sc.nextFloat();
        float isimti = 0;
        int counter = 2;

        while(likutis != 0){
            System.out.println("Likutis: " + likutis + " EUR. Iveskite suma, kuria norite nuimti");
            isimti = sc.nextFloat();
            if(isimti == 0 ){
                break;
            }
            if(isimti > likutis){
                if(counter == 0){
                    System.out.println("Likutis per mazas, virsytas bandymu skaicius");
                    break;
                }
                System.out.println("Likutis per mazas, jums liko " + counter + " bandymai");
                counter--;
            }else{
                likutis -= isimti;
                counter = 2;

            }
        }
    }
}