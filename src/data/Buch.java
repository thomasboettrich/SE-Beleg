package data;

import service.Identifiable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Boettrich, Thomas (s67131@htw-dresden.de)
 */

@Entity
@Table(name="Buch")
public class Buch implements Identifiable, Serializable {

    @Id
    @Column(name = "BuchNr")
    private String BuchNr;

    @Column(name = "Titel")
    private String Titel;

    @ManyToOne
    @JoinColumn(name = "AutorNr")
    private String AutorNr;

    @ManyToOne
    @JoinColumn(name = "VerlagNr")
    private String VerlagNr;

    @Column(name = "Erscheinungsort")
    private String Erscheinungsort;

    @Column(name = "Erscheinungsjahr")
    private Date Erscheinungsjahr;

    @Column(name = "Auflage")
    private int Auflage;

    @Column(name = "Umfang")
    private int Umfang;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "Standort")
    private String Standort;

    @Column(name = "Sprache")
    private String Sprache;

    @Override
    public String getId() {
        return BuchNr;
    }

    public void setId(final String buchNr) {
        BuchNr = buchNr;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(final String titel) {
        Titel = titel;
    }

    public String getAutorNr() {
        return AutorNr;
    }

    public void setAutorNr(final String autorNr) {
        AutorNr = autorNr;
    }

    public String getVerlagNr() {
        return VerlagNr;
    }

    public void setVerlagNr(final String verlagNr) {
        VerlagNr = verlagNr;
    }

    public String getErscheinungsort() {
        return Erscheinungsort;
    }

    public void setErscheinungsort(final String erscheinungsort) {
        Erscheinungsort = erscheinungsort;
    }

    public Date getErscheinungsjahr() {
        return Erscheinungsjahr;
    }

    public void setErscheinungsjahr(final Date erscheinungsjahr) {
        Erscheinungsjahr = erscheinungsjahr;
    }

    public int getAuflage() {
        return Auflage;
    }

    public void setAuflage(final int auflage) {
        Auflage = auflage;
    }

    public int getUmfang() {
        return Umfang;
    }

    public void setUmfang(final int umfang) {
        Umfang = umfang;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(final String ISBN) {
        this.ISBN = ISBN;
    }

    public String getStandort() {
        return Standort;
    }

    public void setStandort(final String standort) {
        Standort = standort;
    }

    public String getSprache() {
        return Sprache;
    }

    public void setSprache(final String sprache) {
        Sprache = sprache;
    }

    protected  Buch() {
    }

    public Buch(final String buchNr, final String titel, final String autorNr, final String verlagNr,
                final String erscheinungsort, final Date erscheinungsjahr, final int auflage, final int umfang,
                final String ISBN, final String standort, final String sprache) {
        BuchNr = buchNr;
        Titel = titel;
        AutorNr = autorNr;
        VerlagNr = verlagNr;
        Erscheinungsort = erscheinungsort;
        Erscheinungsjahr = erscheinungsjahr;
        Auflage = auflage;
        Umfang = umfang;
        this.ISBN = ISBN;
        Standort = standort;
        Sprache = sprache;
    }
}