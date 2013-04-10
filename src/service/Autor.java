package service;

/**
 * @author tbh (thomas.boettrich@intecsoft.de)
 */

//TODO: Verbindung zur Datenbank

public class Autor {
    private String AutorID;
    private String Name;

    public Autor(final String autorID, final String name) {
        AutorID = autorID;
        Name = name;
    }

    public String getAutorID() {
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
}
