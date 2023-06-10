package com.example.tareaii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultados extends AppCompatActivity {

    TextView tvnom,tvape,tvedad,tvcorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        tvnom = findViewById(R.id.tvnom);
        tvape = findViewById(R.id.tvape);
        tvedad = findViewById(R.id.tvedad);
        tvcorreo = findViewById(R.id.tvcorre);

      String nomb = getIntent().getStringExtra("nom");
      String apelli = getIntent().getStringExtra("apell");
      String eda = getIntent().getStringExtra("edad");
      String corre = getIntent().getStringExtra("correo");

      tvnom.setText(nomb);
        tvape.setText(apelli);
        tvedad.setText(eda);
        tvcorreo.setText(corre);
    }
}