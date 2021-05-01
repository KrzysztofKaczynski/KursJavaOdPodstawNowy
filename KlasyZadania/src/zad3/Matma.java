package zad3;

/**
 * Created by Krzysztof Kaczynski on 09:27 - 01.05.2021.
 */
public class Matma {
    /*
    3. Stwórz własną klasę o nazwie “Matma”. Dodaj w niej metody liczące:
- obwód i pole koła (jako argument do metody przyjmuje promień koła)
- obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)

Metody niech będą statyczne i zwracają wynik odpowiedniego typu.
Dodatkowo utwórz w klasie statyczne, stałe pole, które będzie przechowywać wartość PI = 3.14.
Do obliczeń koła wykorzystaj Twoje PI.
Pola i metody będą publiczne.
Jeżeli chcesz, możesz rozszerzyć swoją klasę Matma o metody z zadania 2.
Musisz jednak pamiętać, aby delikatnie je przerobić, żeby mogły być metodami statycznymi.
     */

    public static final double PI = 3.14;

    public static double obwodKola(double r) {
        return 2 * PI * r;
    }

    public static double poleKola(double r) {
        return PI * r * r;

    }

    public static double obwodProstokata(double a, double b) {
        return 2 * (a + b);

    }

    public static double poleProstokata(double a, double b){
        return a * b;
    }
}
