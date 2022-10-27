package Abstractizare;

public class Main {
    public static void main(String[] args) {
        Parcare parc = new Parcare();
        Mercedes m = new Mercedes();
        m.nume = "Amg- Viteza Mare";
        parc.p.add(m);
        parc.afisareVehicule(parc.p);

    }

}
