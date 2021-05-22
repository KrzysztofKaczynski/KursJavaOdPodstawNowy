package wyjatki.zadanie3;

/**
 * Created by Krzysztof Kaczynski on 09:31 - 22.05.2021.
 */
public class LiczbaUjemnaException extends RuntimeException {

    public LiczbaUjemnaException () {
        super("Liczba nie może być ujemna");
    }
}
