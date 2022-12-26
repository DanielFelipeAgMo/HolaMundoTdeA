package com.example.app_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaCorreo, cajaClave;
    String usuario = "correo@tdea.com";
    String clave = "clavetdea";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaCorreo = findViewById(R.id.correoUsuario);
        cajaClave = findViewById(R.id.claveUsuario);
    }
    public void BotonIngresar(View view){
        if (cajaCorreo.equals(usuario) & cajaClave.equals(clave)){
            Toast.makeText(this, "Acceso exitoso", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Acceso denegado, verifique los datos ingresados", Toast.LENGTH_SHORT).show();
        }
    }
}