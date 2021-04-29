package kostruktor;

/**
 * Created by Krzysztof Kaczynski on 10:56 - 29.04.2021.
 */
public class MainKonstruktor {

    public static void main(String[] args){

        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor(5, 105);
       // klasaKonstruktor.pierwszePole = 5;
       // klasaKonstruktor.drugiePole = 105;

        System.out.println(klasaKonstruktor.pierwszePole);
        System.out.println(klasaKonstruktor.drugiePole);
    }
}
