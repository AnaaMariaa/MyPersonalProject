package lab2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String denumire;
    private ArrayList<Carte> carti=new ArrayList<Carte>();

    public ArrayList<Carte> getCarti() {
        return carti;
    }

    public void setCarti(ArrayList<Carte> carti) {
        this.carti = carti;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Disciplina(String denumire) {
        this.denumire = denumire;

    }
    public Disciplina() {
     super();
    }
    public void adaugaAutor(Carte c) {
        if (!this.carti.contains(c))
            this.carti.add(c);
    }
public List<Carte> getCartiPerAutor(Autor a){
        List<Carte> deR=new ArrayList<>();
        for(Carte c:this.carti){
            for(Autor aut:c.getAutori()){
                if (aut.equals(a)) {
                    deR.add(c);
                }
            }
        }
        return deR;
}
}
