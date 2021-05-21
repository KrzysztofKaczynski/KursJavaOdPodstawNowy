import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Krzysztof Kaczynski on 08:23 - 20.05.2021.
 */
public class WyjatekPrzenoszenie {

    public void wyjatkowaMetoda() throws FileNotFoundException {

        File file = new File("plik.txt");
        InputStream inputStream = new FileInputStream(file);


    }
}
