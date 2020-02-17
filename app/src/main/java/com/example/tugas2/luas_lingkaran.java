package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_lingkaran extends AppCompatActivity {
    private TextView tvhasil_luas;
    private Button btn_hasil_luas_lingkaran;
    private EditText jari_jari2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        jari_jari2=findViewById(R.id.jari_jari2);
        btn_hasil_luas_lingkaran=findViewById(R.id.btn_luas_lingkaran);
        btn_hasil_luas_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_jari_jari= jari_jari2.getText().toString();
                double jari_jari=Double.parseDouble(s_jari_jari);
                double phi=3.14;
                double hasil_luas=2*phi*jari_jari*jari_jari;
                String s_hasil_luas=String.valueOf(hasil_luas);
                tvhasil_luas.setText(s_hasil_luas);
            }
        });
    }
}
