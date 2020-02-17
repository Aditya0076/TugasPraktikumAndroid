package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingLingkaran extends AppCompatActivity {
    private TextView tvhasil_keliling;
    private Button btn_hasil_keliling;
    private EditText jari_jari1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);
        jari_jari1=findViewById(R.id.jari_jari1);
        btn_hasil_keliling=findViewById(R.id.btn_keliling_lingkaran);
        btn_hasil_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_jari_jari= jari_jari1.getText().toString();
                double jari_jari=Double.parseDouble(s_jari_jari);
                double phi=3.14;
                double hasil_keliling=2*phi*jari_jari;
                String s_hasil_keliling=String.valueOf(hasil_keliling);
                tvhasil_keliling.setText(s_hasil_keliling);
            }
        });

    }
}
