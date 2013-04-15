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
@Table (name = "Verlag")
public class Verlag implements Identifiable, Serializable{

    @Id
    @OneToMany
    @JoinColumn (name = "VerlagID")
    private String VerlagID;

    @Column (name = "Name")
    private String Name;

    @Override
    public Serializable getId() {
        return VerlagID;
    }

    public void setVerlagID(final String verlagID) {
        VerlagID = verlagID;
    }

    public String getName() {
        return Name;
    }

    public void setName(final String name) {
        Name = name;
    }

    protected Verlag() {
    }

    public Verlag(final String verlagID, final String name) {
        VerlagID = verlagID;
        Name = name;
    }
}
