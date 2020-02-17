package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnKelilingLingkaran,btnLuasLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKelilingLingkaran= findViewById(R.id.btn_keliling_lingkaran);
        btnKelilingLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent=new Intent(MainActivity.this,KelilingLingkaran.class);
                startActivity(moveIntent);
            }
        });
//        btnLuasLingkaran=findViewById(R.id.btn_luas_lingkaran);
//        btnLuasLingkaran.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent moveIntenLuas=new Intent(MainActivity.this,luas_lingkaran.class);
//                startActivity(moveIntenLuas);
//            }
//        });

    }
}
