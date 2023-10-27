package Models;

public class Reservation extends Conexion {
    
    private int id_reservation;
    private int user;
    private int id_court;
    private String hours;
    private String date;
    private String ifpay;
    private String status;

    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public int getuser() {
        return user;
    }

    public void setuser(int user) {
        this.user = user;
    }

    public int getId_court() {
        return id_court;
    }

    public void setId_court(int id_court) {
        this.id_court = id_court;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIfpay() {
        return ifpay;
    }

    public void setIfpay(String ifpay) {
        this.ifpay = ifpay;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }
      
}
