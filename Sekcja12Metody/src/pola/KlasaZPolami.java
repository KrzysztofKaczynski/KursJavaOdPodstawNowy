package pola;

/**
 * Created by Krzysztof Kaczynski on 15:50 - 25.04.2021.
 */
public class KlasaZPolami {

    int liczbaCalkowita;

    void zwrocWartoscPola() {
        System.out.println("Zwrocona wartość pola: " + liczbaCalkowita);
    }
    void ustawWartoscPola(int wartość) {
        liczbaCalkowita = wartość;
    }
    int zwrocWartoscPolaZMetody(){
        return liczbaCalkowita;
    }
}
