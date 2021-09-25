public class String4 {
    public static void main(String[] args) {
        String pirmaEilute = "PHP Exercises and ";
        System.out.println(pirmaEilute);
        String antraEilute = "Python Exercises";
        System.out.println(antraEilute);
        String naujaEilute = pirmaEilute.concat(antraEilute); // prideda vietoj + zenklo sis metodas

        System.out.println("The concatenated String is: " + naujaEilute);
    }
}
