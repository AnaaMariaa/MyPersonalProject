package l1;

public class ArticolComanda {
    private Produse produs;
    private Double cantitate;

    public Produse getProdus() {
        return produs;
    }

    public void setProdus(Produse produs) {
        this.produs = produs;
    }

    public Double getCantitate() {
        return cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    public  ArticolComanda(Produse produs, double cantitate) {
       super();
        this.produs = produs;
        this.cantitate = cantitate;
    }

    public ArticolComanda() {
        super();
    }

    double calculValoare() {
        double valoare = 0.0;
        if (this.cantitate != null && this.produs.getPret() != null)
            valoare = this.cantitate * this.produs.getPret();
        return valoare;
    }

    private Double valoareArticol;

    public Double getValoareArticol() {
        this.valoareArticol = cantitate;
        return valoareArticol;
    }

}
