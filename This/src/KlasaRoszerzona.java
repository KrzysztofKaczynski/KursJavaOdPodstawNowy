/**
 * Created by Krzysztof Kaczynski on 07:58 - 09.05.2021.
 */
public class KlasaRoszerzona extends KlasaPodstawowa {

    int x;
    int y;
    int pole;

    KlasaRoszerzona() {
        System.out.println("Konstruktor z klasa roszerzona");
    }

    KlasaRoszerzona(int x) {
        this.x = x;
        System.out.println("Konstruktor z klasa roszerzona z parametrem: " + x);
    }


    KlasaRoszerzona(int x, int y) {
        this(x);
        this.y = y;
        System.out.println("Konstruktor z klasa roszerzona z parametrami: " + x + " " + y);

    }
    void metodaZTejKlsay() {

    }
    void metodaZParametrami(int pole) {
        this.pole = pole;

    }

}

