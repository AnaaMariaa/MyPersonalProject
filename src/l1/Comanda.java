package l1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {
    private Date dataComanda =new Date();

    public Date getDataComanda() {
        return dataComanda;
    }

    public List<ArticolComanda> getArticole() {
        return articole;
    }

    public void setArticole(List<ArticolComanda> articole) {
        this.articole = articole;
    }

    public Double getValoareTotala() {
        if(this.valoareTotala==null)
        this.valoareTotala=calculValoareTotala();
        return valoareTotala;
    }

    public void setValoareTotala(Double valoareTotala) {
        this.valoareTotala = valoareTotala;
    }

    private List<ArticolComanda> articole =new ArrayList<ArticolComanda>();
    private Double valoareTotala;

    public Comanda() {
        super();
    }

    public Comanda(Date dataComanda) {
        super();
        this.dataComanda = dataComanda;
    }
    private Double calculValoareTotala(){
        Double rezultat =0.0;
        for(ArticolComanda a: this.articole)
            rezultat+=a.getValoareArticol();
        return rezultat;
    }
    public void adaugaArticol(ArticolComanda a){
        if(!this.articole.contains(a)){
            this.articole.add(a);
        }
    }
}
