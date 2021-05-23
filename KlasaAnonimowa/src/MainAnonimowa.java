/**
 * Created by Krzysztof Kaczynski on 07:36 - 23.05.2021.
 */
public class MainAnonimowa {
    public static void main(String[] args) {

        Zwykla obiektKlasyAnonimowej = new Zwykla() {
            @Override
            public void metodaZwykla() {
                System.out.println("Metoda wywolana z klasy anonimowej");
            }
        };

        obiektKlasyAnonimowej.metodaZwykla();

        Zwykla klasaZwykla = new Zwykla();
        metodaTutaj(new Zwykla() {
            @Override
            public void metodaZwykla() {
                System.out.println("Zmienione zachowanie");
            }
        });

    }

    public static void metodaTutaj (Zwykla parametr) {
        parametr.metodaZwykla();
    }
}
