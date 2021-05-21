import java.io.FileNotFoundException;

/**
 * Created by Krzysztof Kaczynski on 08:23 - 20.05.2021.
 */
public class MainWyjatkiPrzenoszenie {
    public static void main(String[] args) {

        WyjatekPrzenoszenie wyjatekPrzenoszenie = new WyjatekPrzenoszenie();
        try {
            wyjatekPrzenoszenie.wyjatkowaMetoda();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
