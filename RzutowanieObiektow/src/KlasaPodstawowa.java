/**
 * Created by Krzysztof Kaczynski on 09:34 - 09.05.2021.
 */
public class KlasaPodstawowa {

    private int liczba;

    public void ustawLiczba(int liczba) {
        this.liczba = liczba;
    }

    public void wyswietlLiczba() {
        System.out.println("Liczba: " + liczba);
    }
}
