package wyjatki;

/**
 * Created by Krzysztof Kaczynski on 09:14 - 22.05.2021.
 */
public class DzieleniePrzezZeroException extends Exception {

    public DzieleniePrzezZeroException() {
        super("Nie wolno dzielic przez zero");
    }
}
