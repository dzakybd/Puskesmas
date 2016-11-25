package id.ac.its.puskesmas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class FormReg extends AppCompatActivity {
    private EditText input_nama,input_alamat,input_pekerjaan,input_ttl,input_umur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasi);
        input_nama = (EditText) findViewById(R.id.input_nama);
        input_alamat = (EditText) findViewById(R.id.input_alamat);
        input_pekerjaan = (EditText) findViewById(R.id.input_pekerjaan);
        input_ttl = (EditText) findViewById(R.id.input_ttl);
        input_umur = (EditText) findViewById(R.id.input_umur);
        input_umur = (EditText) findViewById(R.id.input_umur);
    }

    public void registrasi(View v){
        setdata();
        Snackbar.make(v, "Terdaftar", Snackbar.LENGTH_LONG)
                .show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FormReg.this, FormKeluhan.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }

    public void setdata(){
        Pasien pasien = new Pasien();
        pasien.setNama(input_nama.getText().toString());
        pasien.setAlamat(input_alamat.getText().toString());
        pasien.setLahir(input_ttl.getText().toString());
        pasien.setPekerjaan(input_ttl.getText().toString());
        pasien.setUmur(Integer.parseInt(input_umur.getText().toString()));
    }

}
