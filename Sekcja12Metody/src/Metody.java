/**
 * Created by Krzysztof Kaczynski on 10:04 - 25.04.2021.
 */
public class Metody {
    public static void main(String[] args) {

        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'b');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 100);
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(true, 100);

        int wynikDodawania = nazwaObiektu.dodawanie(5, 156);
        System.out.println("Wynik dodawanie: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(365.1);
        System.out.println("Wynik dodawania doubla: " + wynikKolejnejMetody);

        System.out.println("Wartość logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));
        nazwaObiektu.voidKtoryMialByCosZwrocic(false);
        int cyfra = nazwaObiektu.przykladKolejnej();
        System.out.println(cyfra);
        int zwrote = nazwaObiektu.zwrocOdWartosciLogicznej(true, 15);
        System.out.println(zwrote);

    }

}
