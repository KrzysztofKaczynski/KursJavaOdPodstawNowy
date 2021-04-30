/**
 * Created by Krzysztof Kaczynski on 09:22 - 30.04.2021.
 */
public class MainStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal klasaStaticFinal = new KlasaStaticFinal();
        klasaStaticFinal.pole = 10;

        KlasaStaticFinal.poleStatic = 123;
        klasaStaticFinal.poleStatic = 45;
        System.out.println(KlasaStaticFinal.poleStatic);

        KlasaStaticFinal.metodaStatic();

        System.out.println(klasaStaticFinal.poleFinal);

        System.out.println(KlasaStaticFinal.JAKIS_TEKST);

    }
}
