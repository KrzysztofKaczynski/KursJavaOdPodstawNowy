/**
 * Created by Krzysztof Kaczynski on 10:20 - 01.05.2021.
 */
public class MainDziedziczenie {
    public static void main(String[] args) {

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        KlasaBardziejRoszerzona klasaBardziejRoszerzona = new KlasaBardziejRoszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRoszerzona();
        klasaBardziejRoszerzona.metodaPierwsza();
    }
}
