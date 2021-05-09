/**
 * Created by Krzysztof Kaczynski on 07:57 - 09.05.2021.
 */
public class MainThis {
    public static void main(String[] args) {

        KlasaRoszerzona obiekt1 = new KlasaRoszerzona();
        System.out.println("----------------------");
        KlasaRoszerzona obiekt2 = new KlasaRoszerzona(111);
        System.out.println("----------------------");
        KlasaRoszerzona obiekt3 = new KlasaRoszerzona(1, 2);
        System.out.println("----------------------");
        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);
        System.out.println("----------------------");
        obiekt3.metodaZParametrami(123456);
        System.out.println("pole: " + obiekt3.pole);
    }
}
