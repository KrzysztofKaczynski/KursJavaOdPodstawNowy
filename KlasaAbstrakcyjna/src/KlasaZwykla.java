/**
 * Created by Krzysztof Kaczynski on 09:00 - 23.05.2021.
 */
public class KlasaZwykla extends PrzykladowaKlasaAbstrakcyjna{
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisalem z klasy zwykłej");
    }

    @Override
    public int metodaZParametrem(String z) {
        System.out.println("Wypisuje parametr" + z);
        return 101;
    }
}
