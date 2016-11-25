package id.ac.its.puskesmas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormObat extends AppCompatActivity {
    private int resepi;
    private TextView obat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Apotik");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obat);
        Button button_obat = (Button) findViewById(R.id.button_obat);
        button_obat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        obat = (TextView) findViewById(R.id.textView_obat);
        resepi = getIntent().getExtras().getInt("resepi");
        resep();
    }

    public void resep(){
        Apoteker apoteker = new Apoteker();
        obat.setText(apoteker.ambilobat(resepi));
    }
}
