package com.example.a04_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipoAveriaClicked(View view) {
        //Como todos los checkBox apuntan al mismo método hay que diferenciarlos aquí

        CheckBox checkBox = (CheckBox) view; //Convierte un objeto vista a checkBox
        boolean chequeado = checkBox.isChecked(); //isChecked(), devuelve true si el elemento ha sido seleccionado o false si no lo ha sido
        String tipo = "";

        //Sobre qué checkbos se ha hecho click
        switch (view.getId()){
            case R.id.checkBoxChapa:
                tipo = "Chapa y pintura";
                break;
            case R.id.checkBoxCristal:
                tipo = "Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo = "Avería mecánica";
                break;

        }

        Toast toast1 = Toast.makeText(this, tipo + "(" +chequeado+")", Toast.LENGTH_SHORT);
        toast1.show();
    }
}
