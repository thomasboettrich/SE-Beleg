package service;

/**
 * @author tbh (thomas.boettrich@intecsoft.de)
 */

//TODO: Verbindung zur Datenbank

public class Verlag {
    private String VerlagID;
    private String Name;

    public Verlag(final String verlagID, final String name) {
        VerlagID = verlagID;
        Name = name;
    }

    public String getVerlagID() {
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
}
