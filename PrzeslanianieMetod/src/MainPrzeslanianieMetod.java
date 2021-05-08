/**
 * Created by Krzysztof Kaczynski on 09:12 - 08.05.2021.
 */
public class MainPrzeslanianieMetod {
    public static void main(String[] args) {
        //ang. override
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRoszerzona klasaRoszerzona = new KlasaRoszerzona();

        klasaPodstawowa.metoda();
        klasaRoszerzona.metoda();
    }
}
