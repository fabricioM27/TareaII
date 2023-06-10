package com.example.tareaii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nombres, apellidos, edad, correo;
    Button btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = findViewById(R.id.nombre);
        apellidos = findViewById(R.id.apellidos);
        edad = findViewById(R.id.edad);
        correo = findViewById(R.id.correo);

        btnenviar = (Button) findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                intent.putExtra("nom", nombres.getText().toString());
                intent.putExtra("apell", apellidos.getText().toString());
                intent.putExtra("edad", edad.getText().toString());
                intent.putExtra("correo", correo.getText().toString());
                startActivity(intent);
                
                limpiar();
            }
        });
    }

    private void limpiar() {
        nombres.setText("");
        apellidos.setText("");
        edad.setText("");
        correo.setText("");
    }
}