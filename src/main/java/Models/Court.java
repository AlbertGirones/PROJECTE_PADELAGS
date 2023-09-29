
package Models;

public class Court extends Conexion {
    
    private int id_court;
    private String name;
    private String ubication;
    private String photo;
    private boolean status;

    public int getId_court() {
        return id_court;
    }

    public void setId_court(int id_court) {
        this.id_court = id_court;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isStatus(boolean status) {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
