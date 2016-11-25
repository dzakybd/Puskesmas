package id.ac.its.puskesmas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FormKeluhan extends AppCompatActivity {
    private TextView saran;
    private TextView resep;
    private int resepi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Periksa Kesehatan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keluhan);

        Spinner dynamicSpinner = (Spinner) findViewById(R.id.spinner);
        saran = (TextView) findViewById(R.id.textView_saran);
        resep = (TextView) findViewById(R.id.textView_resep);
        Button button_keluhan = (Button) findViewById(R.id.button_keluhan);
        button_keluhan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FormKeluhan.this, FormObat.class);
                i.putExtra("resepi",resepi);
                startActivity(i);
                finish();
            }
        });
        String[] items = new String[] { "","Panas", "Pusing", "Pilek" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        dynamicSpinner.setAdapter(adapter);

        dynamicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                keluhan(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void keluhan(int position){
        Dokter dokter = new Dokter();
        Resep resepa = new Resep();
        resepi=position;
        saran.setText(dokter.saran(position));
        resep.setText(resepa.resep(position));
    }
}
