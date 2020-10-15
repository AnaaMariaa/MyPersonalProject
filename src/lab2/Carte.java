package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carte {
    private String editura;
    private Integer an;
    private String titlu;

    public List<Autor> getAutori() {
        return autori;
    }

    public void setAutori(List<Autor> autori) {
        this.autori = autori;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    private List<Autor> autori = new ArrayList<>();

    public Carte(String editura, String titlu, Integer an) {
        this.editura = editura;
        this.an = an;
        this.titlu = titlu;
    }

    public Carte() {
        super();
    }

    public void adaugaAutor(Autor a) {
        if (!this.autori.contains(a))
            this.autori.add(a);
    }

    @Override
    public String toString() {
        return "Carte{" +
                "editura='" + editura + '\'' +
                ", an=" + an +
                ", titlu='" + titlu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte)) return false;
        Carte carte = (Carte) o;
        return editura.equals(carte.editura) &&
                an.equals(carte.an) &&
                titlu.equals(carte.titlu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(editura, an, titlu);
    }
}
