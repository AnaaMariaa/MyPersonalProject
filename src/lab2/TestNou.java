package lab2;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestNou {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        Disciplina comert = new Disciplina("Comert electronic");
        Disciplina programare2 = new Disciplina("Progrmare2");
        Autor a1 = new Autor("Greavu Valerica", f.parse("14/06/1976"));
        Autor a2 = new Autor("Munteanu B", f.parse("15/12/1978"));
        Autor a3 = new Autor("Strimbei C", f.parse("14/11/1970"));
        Autor a4 = new Autor("Dospinescu O", f.parse("12/12/1980"));
        Autor a5 = new Autor("Grama A", f.parse("29/09/1970"));
        Carte c1 = new Carte("Comert electronic in zilele noastre", "Polirom", 2020);
        Carte c2 = new Carte("Retele de calculatoare si cloud computing", "Editura Junimea", 2019);
        Carte c3 = new Carte("Programare orientata obiect", "Editura Junimea", 2020);
        Carte c4 = new Carte("Programare", "Editura UAIC", 2019);
        Carte c5 = new Carte("Tehnologii internationale pentru afaceri", "Editura Solomon Libris", 2020);
        c1.adaugaAutor(a1);
        c2.adaugaAutor(a2);
        c3.adaugaAutor(a3);
        c4.adaugaAutor(a4);
        c5.adaugaAutor(a5);
        System.out.println(c1.equals(c2));
      //  System.out.println(comert.getCartiPerAutor(a1));
        List<Carte> lst =getCartiAutorDisciplina(comert, a1);
        System.out.println(lst);

    }

    static List<Carte> getCartiAutorDisciplina(Disciplina d, Autor a) {
        List<Carte> deR = new ArrayList<>();
        for (Carte c : d.getCarti())
            for (Autor aut : c.getAutori())
                if (aut.equals(a))
                    deR.add(c);
        return deR;
    }
}
