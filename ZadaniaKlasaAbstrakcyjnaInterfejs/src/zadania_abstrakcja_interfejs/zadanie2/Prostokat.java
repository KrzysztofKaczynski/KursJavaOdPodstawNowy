package zadania_abstrakcja_interfejs.zadanie2;

/**
 * Created by Krzysztof Kaczynski on 09:17 - 29.05.2021.
 */
public class Prostokat implements Figury {

   private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return 2 * (a + b);
    }

    @Override
    public double pole() {
        return a * b;

    }
}
