/**
 * Created by Krzysztof Kaczynski on 07:26 - 23.05.2021.
 */
public class Zewnetrzna {

    int poleZewnetrzne;

    int metodaZewnetrzna() {
        Wewnetrzna obiekt = new Wewnetrzna();
        obiekt.poleWewnetrzne = 10;
        obiekt.metodaWewnetrzna();
        return -1;

    }
    class Wewnetrzna {

        int poleWewnetrzne;

        int metodaWewnetrzna() {
            metodaZewnetrzna();
            poleZewnetrzne = 101;

            return -2;
        }
    }
}
