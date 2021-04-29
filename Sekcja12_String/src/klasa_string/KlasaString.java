package klasa_string;

/**
 * Created by Krzysztof Kaczynski on 11:56 - 29.04.2021.
 */
public class KlasaString {
    public static void main(String[] args) {
        String nazaweDlaStringa = "Nazwa dla Stringa";
        System.out.println(nazaweDlaStringa);
        String kolejnyStringa = "jakiś kolejny tekst";
        System.out.println(nazaweDlaStringa + " " + kolejnyStringa);
        String polaczneStringi = nazaweDlaStringa + " " + kolejnyStringa;
        System.out.println(polaczneStringi);

        System.out.println("Lenght: " + polaczneStringi.length());

        System.out.printf("Lenght: %s%n", polaczneStringi.isEmpty());

        System.out.println("charAt: " + polaczneStringi.charAt(0));

        String test = "123456789";
        System.out.println("substring: " + test.substring(5));
        System.out.println("substring: " + test.substring(5, 6));
        String nowyString = "      sddd dddd          ";
        System.out.println(nowyString.trim());
        String duzeIMale = "gaggGGGGG hhhhHHHH";
        System.out.println(duzeIMale.toLowerCase());
        System.out.println(duzeIMale.toUpperCase());

        String czyZawieraJakisTekst = "Czy zawiera jakis tekst";
        System.out.println(czyZawieraJakisTekst.startsWith("Cz"));
        System.out.println(czyZawieraJakisTekst.endsWith("st"));

        System.out.println(czyZawieraJakisTekst.contains("jak"));
        System.out.println(czyZawieraJakisTekst.replace('e', '3' ));
    }
}
