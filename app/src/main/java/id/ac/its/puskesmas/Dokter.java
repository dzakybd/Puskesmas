package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 24/11/2016.
 */

public class Dokter {
    private String nip;
    private String nama;
    private String telp;
    private String alamat;

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNip() {
        return nip;
    }

    public String getTelp() {
        return telp;
    }

    public String saran(int penyakit) {
        String text;
        switch (penyakit){
            case 1:
                text="Untuk penyakit panas ini biasanya anda kurang istirahat, " +
                        "jadi anda terlalu banyak kesibukan sehingga anda lupa dengan diri anda " +
                        "Silahkan resep dibawa ke bagian apoteker " +
                        "Panas tubuh ";
                break;
            case 2:
                text="Untuk penyakit pusing ini biasanya anda kurang istirahat, " +
                        "jadi anda terlalu banyak kesibukan sehingga anda lupa dengan diri anda " +
                        "Silahkan resep dibawa ke bagian apoteker " +
                        "Pusing Kepala ";
                break;
            case 3:
                text="Untuk penyakit pilek ini biasanya anda kurang istirahat, " +
                        "jadi anda terlalu banyak kesibukan sehingga anda lupa dengan diri anda " +
                        "Silahkan resep dibawa ke bagian apoteker " +
                        "Hidung Tersumbat ";
                break;
            default:
                text="";
                break;
        }
        return text;
    }

}
