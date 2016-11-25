package id.ac.its.puskesmas;

import android.app.Activity;

/**
 * Created by Dzaky on 25/11/2016.
 */

public class Prosesdata {

    public void setdata(Activity ini, String a,String b,String c,String d,String e){
        Pasien pasien = new Pasien();
        pasien.setNama(a);
        pasien.setAlamat(b);
        pasien.setLahir(c);
        pasien.setPekerjaan(d);
        pasien.setUmur(Integer.parseInt(e));

        PLoket pLoket = new PLoket();
        pLoket.simpandb(ini, pasien);
    }
}
