package com.example.t5_a3_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText caja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja = findViewById(R.id.caja);
    }

    public void btn0 (View v){
        caja.setText(caja.getText().toString() + "0");
    }

    public void btn1 (View v){
        caja.setText(caja.getText().toString() + "1");
    }

    public void btn2 (View v){
        caja.setText(caja.getText().toString() + "2");
    }

    public void btn3 (View v){
        caja.setText(caja.getText().toString() + "3");
    }

    public void btn4 (View v){
        caja.setText(caja.getText().toString() + "4");
    }

    public void btn5 (View v){
        caja.setText(caja.getText().toString() + "5");
    }

    public void btn6 (View v){
        caja.setText(caja.getText().toString() + "6");
    }

    public void btn7 (View v){
        caja.setText(caja.getText().toString() + "7");
    }

    public void btn8 (View v){
        caja.setText(caja.getText().toString() + "8");
    }

    public void btn9 (View v){
        caja.setText(caja.getText().toString() + "9");
    }


}