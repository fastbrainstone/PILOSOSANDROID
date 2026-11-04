package com.example.pilosos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtContrasena;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(v -> {

            String usuario = txtUsuario.getText().toString().trim();
            String contrasena = txtContrasena.getText().toString();

            if (usuario.isEmpty() || contrasena.isEmpty()) {

                Toast.makeText(
                        MainActivity.this,
                        "Por favor, completa todos los campos.",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Bienvenido a PILOSOS",
                        Toast.LENGTH_SHORT
                ).show();

            }
        });
    }
}