package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 25/11/2016.
 */

public class Prosesdata {

    public void setdata(String a,String b,String c,String d,String e){
        Pasien pasien = new Pasien();
        pasien.setNama(a);
        pasien.setAlamat(b);
        pasien.setLahir(c);
        pasien.setPekerjaan(d);
        pasien.setUmur(Integer.parseInt(e));

        PLoket pLoket = new PLoket();
        pLoket.simpandb(pasien);
    }
}
