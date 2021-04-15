package operatory_artmetyczne;

public class OperatoryArtmetyczne {
    public static void main(String[] args) {

        System.out.println(3 + 5);
        System.out.println(5 - 3);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 3);

        double a = 9;
        double b = 2;

        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        double odejmowanie = a - b;
        System.out.println("Odejmmowanie: " + odejmowanie);
        double mnozenie = a * b;
        System.out.println("Mnozenie: " + mnozenie);
        double dzielenie = a / b;
        System.out.println("Dzielenie: " + dzielenie);
        double resztaZDzielenia = a % b;
        System.out.println("Reszta: " + resztaZDzielenia);

        a += b; // inaczej: a = a + b;
        System.out.println("a = a + b to: " + a);

        a -= b;
        System.out.println("a = a - b" + a);


    }
}
