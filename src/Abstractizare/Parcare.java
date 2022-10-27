package Abstractizare;

import java.util.ArrayList;
import java.util.List;

public class Parcare {
    ArrayList<Vehicule> p = new ArrayList<>();
    public static void afisareVehicule(List<Vehicule> p){
        for (Vehicule v:p) {
            System.out.println(v.getNume());

        }
    }
}
