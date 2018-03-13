package com.unidad3.gio.practica001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText cuadro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cuadro=(EditText) findViewById(R.id.TxtPalabra);
    }
//sintaxis para el metodo de boton
    public void obtener(View v){
       String palabra= String.valueOf(cuadro.getText());
       palabra=palabra.toUpperCase();
         StringBuilder pala=new StringBuilder(palabra);

        pala.reverse();

        cuadro.setText(pala);
}
}
