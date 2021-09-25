package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Įveskite keturženklį skaičių : ");
        int skaicius = scan3.nextInt();
        String atitikmuo = "" + skaicius;
        scan3.close();

                System.out.println("Įvestas skaičius skaitmenimis : ");
                System.out.println("1 skaitmuo : " + atitikmuo.charAt(0));
                System.out.println("2 skaitmuo : " + atitikmuo.charAt(1));
                System.out.println("3 skaitmuo : " + atitikmuo.charAt(2));
                System.out.println("4 skaitmuo : " + atitikmuo.charAt(3));

            }
        }
