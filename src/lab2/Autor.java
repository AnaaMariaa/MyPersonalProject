package lab2;

import javax.xml.crypto.Data;
import java.util.Date;

public class Autor {
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getAnNastere() {
        return anNastere;
    }

    public void setAnNastere(Date anNastere) {
        this.anNastere = anNastere;
    }

    private String nume;

    public Autor(String nume, Date anNastere) {
        this.nume = nume;
        this.anNastere = anNastere;
    }

    private Date anNastere;
    public Autor() {
       super();
    }
}
