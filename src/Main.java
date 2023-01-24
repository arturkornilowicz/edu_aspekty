import pakiet1.Klasa1;
import pakiet2.Klasa2;

public class Main {

    public static void main (String []args) {
        Klasa1 k1 = new Klasa1();
        k1.klasa1_f0();
        k1.klasa1_f1(3.14);
        k1.klasa1_fX(-1);
        k1.klasa1_napis1("Ala ma kota",12);
        k1.klasa1_napis2("AAA",-3);
        Klasa2 k2 = new Klasa2();
        k2.klasa2_f0();
        k2.klasa2_f1(3.14);
    }
}