package pakiet1;

public class Klasa1 {

    int x;

    public void klasa1_f0() {
        System.out.println("  Klasa1::f0");
    }

    public void klasa1_f1(double a) {
        System.out.println("  Klasa1::f1: " + a);
    }

    public void klasa1_fX(int x) {
        System.out.println("  Klasa1::fX");
        this.x = x;
    }

    public void klasa1_napis1(String string, int a) {
        System.out.println("  Klasa1::napis1: " + string + " " + a);
    }

    public void klasa1_napis2(String string, int a) {
        System.out.println("  Klasa1::napis2: " + string + " " + a + " ");
    }
}
