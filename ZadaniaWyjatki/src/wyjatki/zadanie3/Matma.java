package wyjatki.zadanie3;

/**
 * Created by Krzysztof Kaczynski on 09:27 - 01.05.2021.
 */
public class Matma {


    public static final double PI = 3.14;

    public static double obwodKola(double r) {
        if(r < 0){
            throw new LiczbaUjemnaException();

        }
        return 2 * PI * r;
    }

    public static double poleKola(double r) {
        return PI * r * r;

    }

    public static double obwodProstokata(double a, double b) {
        return 2 * (a + b);

    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }
}
