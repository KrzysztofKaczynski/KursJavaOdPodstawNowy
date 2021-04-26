package pola;

/**
 * Created by Krzysztof Kaczynski on 15:15 - 25.04.2021.
 */
public class MainPola {
    public static void main(String[] args) {

        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna= obiekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);
    }
}
