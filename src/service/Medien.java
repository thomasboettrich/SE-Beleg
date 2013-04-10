package service;

/**
 * @author tbh (thomas.boettrich@intecsoft.de)
 */

//TODO: Verbindung zur Datenbank

public class Medien {
    private String MedienID;
    private String Typ;

    public Medien(final String medienID, final String typ) {
        MedienID = medienID;
        Typ = typ;
    }

    public String getMedienID() {
        return MedienID;
    }

    public void setMedienID(final String medienID) {
        MedienID = medienID;
    }

    public String getTyp() {
        return Typ;
    }

    public void setTyp(final String typ) {
        Typ = typ;
    }
}
