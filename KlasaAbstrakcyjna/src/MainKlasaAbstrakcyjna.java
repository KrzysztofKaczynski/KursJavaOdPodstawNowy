/**
 * Created by Krzysztof Kaczynski on 08:22 - 23.05.2021.
 */
public class MainKlasaAbstrakcyjna {
    public static void main(String[] args) {

        KlasaZwykla klasaZwykla = new KlasaZwykla();
        klasaZwykla.metodaAbstrakcyjna();
        klasaZwykla.metodaZParametrem("HEJ");
        klasaZwykla.jakasMetoda();

        Pies pies = new Pies();
        Kon kon = new Kon();
        Kot kot = new Kot();

        System.out.println("Dla psa");
        pies.wydajDzwiek();
        pies.przemieszczanieSiek();
        pies.karmieniePotomstwa();
        pies.podajIloscKonczyn();
        pies.temperaturaCiala();
        System.out.println();

        System.out.println("Dla konia");
        kon.wydajDzwiek();
        kon.przemieszczanieSiek();
        kon.karmieniePotomstwa();
        kon.podajIloscKonczyn();
        kon.temperaturaCiala();
        System.out.println();

        System.out.println("Dla kota");
        kot.wydajDzwiek();
        kot.przemieszczanieSiek();
        kot.karmieniePotomstwa();
        kot.podajIloscKonczyn();
        kot.temperaturaCiala();
    }
}
