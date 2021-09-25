public class Kata1 {
    public static void main(String[] args) {
        int sk1 = 3, sk2 = 4, sk3 = 1, sk4 = 5, sk5 = 2;
        System.out.println("Pirminė seka : sk1 - " + sk1 + " , sk 2 - " + sk2 + " , sk3 - " + sk3 + ", sk4 - " + sk4 + " , sk5 - " + sk5 + ".");

        int sk6 = sk1; // sk6 tampa 3

        sk1 = sk3; // sk1 tampa 1

        // sk1 +

        sk3 = sk6; // sk3 tampa 3

        //sk3 +

        sk6 = sk5; // sk6 igauna 2

        sk5 = sk4; // sk5 igauna 5
        sk4 = sk2; // sk4 igauna 4
        sk2 = sk6; // o sk2 igauna ta reiksme kuria ikelem pries tai


        System.out.println("Surikiuota seka : sk1 - " + sk1 + ", sk 2 - " + sk2 + ", sk3 - " + sk3 + ", sk4 - " + sk4 + ", sk5 - " + sk5 + ".");
    }
}
