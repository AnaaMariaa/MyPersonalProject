package l1;

public class Produse {
    String denumire;
    Double pret;

    Produse(String denumire, Double pret) {
        super();
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Produse() {
        super();
    }


}
