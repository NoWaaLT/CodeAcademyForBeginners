public class String5 {
    public static void main(String[] args) {
        String pirmas = "example.com";
        String antras = "Example.com";

        StringBuffer sb = new StringBuffer(pirmas);
        // arba sb.append(pirmas);
        boolean tkr = pirmas.contentEquals(sb);

        System.out.println("Comparing " + pirmas + " and " + sb + ": " + tkr);
        System.out.println("Comparing " + antras + " and " + sb + ": " + antras.contentEquals(sb));

       /* boolean tikrinam = pirmas.equals(pirmas);
        System.out.println("Comparing " + pirmas + " and " + pirmas + ": " + tikrinam); // equals metodą naudojame su boolean kai norim gauti reikšmę true arba false

        boolean tikrinam1 = pirmas.equals(antras);
        System.out.println("Comparing " + pirmas + " and " + antras + ": " + tikrinam1); */
    }
}
