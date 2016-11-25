package id.ac.its.puskesmas;

import android.content.Context;
import android.content.ContextWrapper;

import com.pixplicity.easyprefs.library.Prefs;

/**
 * Created by Dzaky on 24/11/2016.
 */

public class PLoket {
    private String ID;
    private String nama;
    private String telp;
    private Context context;

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

    public void simpandb(Pasien pasien){
        new Prefs.Builder()
                .setContext(context)
                .setMode(ContextWrapper.MODE_PRIVATE)
                .setPrefsName("puskesmas")
                .setUseDefaultSharedPreference(true)
                .build();

        Prefs.putString("pasien_nama", pasien.getNama());
        Prefs.putString("pasien_alamat", pasien.getAlamat());
        Prefs.putString("pasien_lahir", pasien.getLahir());
        Prefs.putString("pasien_pekerjaan", pasien.getPekerjaan());
        Prefs.putInt("pasien_umur", pasien.getUmur());

    }
}
