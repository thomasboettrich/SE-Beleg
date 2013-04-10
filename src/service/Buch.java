package service;

import java.util.Date;

/**
 * @author tbh (thomas.boettrich@intecsoft.de)
 */

//TODO: Verbindung zur Datenbank

public class Buch {
    private String BuchNr;
    private String Titel;
    private String AutorNr;
    private String VerlagNr;
    private String Erscheinungsort;
    private Date Erscheinungsjahr;
    private int Auflage;
    private int Umfang;
    private String ISBN;
    private String Standort;
    private String Sprache;

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

    public String getBuchNr() {
        return BuchNr;
    }

    public void setBuchNr(final String buchNr) {
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
}