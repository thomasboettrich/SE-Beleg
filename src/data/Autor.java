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
@Table (name = "Autor")
public class Autor implements Identifiable, Serializable {

    @Id
    @OneToMany
    @JoinColumn (name = "AutorID")
    private String AutorID;

    @Column (name = "Name")
    private String Name;

    @Override
    public String getId() {
        return AutorID;
    }

    public void setAutorID(final String autorID) {
        AutorID = autorID;
    }

    public String getName() {
        return Name;
    }

    public void setName(final String name) {
        Name = name;
    }

    protected Autor() {
    }

    public Autor(final String autorID, final String name) {
        AutorID = autorID;
        Name = name;
    }
}
