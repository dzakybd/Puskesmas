package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 24/11/2016.
 */

public class Pasien {
    private String nama;
    private String lahir;
    private int umur;
    private String alamat;
    private String pekerjaan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLahir() {
        return lahir;
    }

    public String getNama() {
        return nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
    
}
