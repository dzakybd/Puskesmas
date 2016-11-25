package id.ac.its.puskesmas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormReg extends AppCompatActivity {
    private EditText input_nama,input_alamat,input_pekerjaan,input_ttl,input_umur;
    private Prosesdata prosesdata;
    private Button button_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Selamat Datang di Puskesmas");
        setContentView(R.layout.registrasi);
        input_nama = (EditText) findViewById(R.id.input_nama);
        input_alamat = (EditText) findViewById(R.id.input_alamat);
        input_pekerjaan = (EditText) findViewById(R.id.input_pekerjaan);
        input_ttl = (EditText) findViewById(R.id.input_ttl);
        input_umur = (EditText) findViewById(R.id.input_umur);
        input_umur = (EditText) findViewById(R.id.input_umur);
        button_daftar = (Button) findViewById(R.id.button_daftar);
        button_daftar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                registrasi(v);
            }
        });
    }

    public void registrasi(View v){
        prosesdata = new Prosesdata();
        prosesdata.setdata(this, input_nama.getText().toString(),input_alamat.getText().toString(),input_ttl.getText().toString(),input_pekerjaan.getText().toString(),input_umur.getText().toString());
        Snackbar.make(v, "Terdaftar", Snackbar.LENGTH_LONG)
                .show();
        Intent i = new Intent(FormReg.this, FormKeluhan.class);
        startActivity(i);
        finish();
    }


}
