package service;

/**
 * @author tbh (thomas.boettrich@intecosft.de)
 */

//TODO: Verbindung zur Datenbank

public class MedienZuordnung {
    private String BuchNr;
    private String MedienID;
    private int Anzahl;

    public MedienZuordnung(final String buchNr, final String medienID, final int anzahl) {
        BuchNr = buchNr;
        MedienID = medienID;
        Anzahl = anzahl;
    }

    public String getBuchNr() {
        return BuchNr;
    }

    public void setBuchNr(final String buchNr) {
        BuchNr = buchNr;
    }

    public String getMedienID() {
        return MedienID;
    }

    public void setMedienID(final String medienID) {
        MedienID = medienID;
    }

    public int getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(final int anzahl) {
        Anzahl = anzahl;
    }
}
