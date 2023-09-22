
package Models;

public class Court {
    
    int id_court;
    String name;
    String ubication;
    
    public Court() {
        
    }

    public Court(int id_court, String name, String ubication) {
        this.id_court = id_court;
        this.name = name;
        this.ubication = ubication;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
    
    public void insertCourt()
    {
        
    }
    
}
