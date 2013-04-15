package data;

import service.Identifiable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Boettrich, Thomas (s67131@htw-dresden.de)
 */

@Entity
@Table (name = "MedienZuordnung")
public class MedienZuordnung implements Identifiable, Serializable {

    @Id
    @OneToOne
    @JoinColumn (name = "BuchNr")
    private String BuchNr;

    @Id
    @ManyToOne
    @JoinColumn (name = "MedienID")
    private String MedienID;

    @Column (name = "Anzahl")
    private int Anzahl;

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

    protected MedienZuordnung() {
    }

    public MedienZuordnung(final String buchNr, final String medienID, final int anzahl) {
        BuchNr = buchNr;
        MedienID = medienID;
        Anzahl = anzahl;
    }

    // TODO: zusammengesetzter Primaerschluessel !!!
    @Override
    public Serializable getId() {
        return null;
    }
}
