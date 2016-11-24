package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 24/11/2016.
 */

public class PLoket {
    private String ID;
    private String nama;
    private String telp;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    public String getID() {
        return ID;
    }
}
