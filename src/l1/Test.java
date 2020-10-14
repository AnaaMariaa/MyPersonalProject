package l1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Produse p1 = new Produse("caiet", 10.0);
        Produse p2 = new Produse("pix", 3.5);
        System.out.println("pretul produsului " + p1.getDenumire() + " este " + p1.getPret());
        ArticolComanda a1 = new ArticolComanda(p1, 3.0);
        ArticolComanda a2 = new ArticolComanda(p2, 2.0);
        Double valoare = a2.getValoareArticol() + a1.getValoareArticol();
        System.out.println("valoarea totala este " + valoare);
        System.out.println("adunarea este " + aduna(3.0, 40.));
        Comanda c = new Comanda(new Date());
//        List<ArticolComanda> lst = new ArrayList<>();
//        lst.add(a1);
//        lst.add(a2);
//        c.setArticole(lst);
        c.adaugaArticol(a1);
        c.adaugaArticol(a2);
        System.out.println("valoarea comenzii "+c.getValoareTotala());
    }

    static Double aduna(Double x, Double y) {
        return x + y;
    }
}
