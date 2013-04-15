package data;

import service.Identifiable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Boettrich, Thomas (s67131@htw-dresden.de)
 */

@Entity
@Table (name = "Medien")
public class Medien implements Identifiable, Serializable {

    @Id
    @OneToMany
    @JoinColumn (name = "MedienID")
    private String MedienID;

    @Column (name = "Medientyp")
    private String Typ;

    @Override
    public String getId() {
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

    protected Medien() {
    }

    public Medien(final String medienID, final String typ) {
        MedienID = medienID;
        Typ = typ;
    }
}
