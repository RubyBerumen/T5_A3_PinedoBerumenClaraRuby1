package com.example.t5_a3_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText caja;
    String guardar = "";
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja = findViewById(R.id.caja);
        caja.setFocusable(true);
        caja.setFocusableInTouchMode(true);
        caja.setInputType(InputType.TYPE_NULL);
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

    public void btnResiduo (View v){
        guardar = caja.getText().toString();
        caja.setText("");
        op = "%";
    }

    public void btnRaiz (View v){
        if(caja.getText().length()>0) {
            double num = Double.parseDouble(caja.getText().toString());
            if(num>0) {
                num = Math.sqrt(num);
                caja.setText(Double.toString(num));
            }
        }
    }

    public void btnPotencia (View v){
        if(caja.getText().length()>0) {
            double num = Double.parseDouble(caja.getText().toString());
            num = Math.pow(num, 2);
            caja.setText(Double.toString(num));
        }
    }

    public void btnLn (View v){
        if(caja.getText().length()>0) {
            double num = Double.parseDouble(caja.getText().toString());
            if(num!=0) {
                num=1/num;
                caja.setText(Double.toString(num));
            }
        }
    }

    public void btnBorrarT (View v){
        guardar = "";
        caja.setText("");
        op = " ";
    }

    public void btnBorrar (View v){
        if(caja.getText().length()>0)
            caja.setText(caja.getText().toString().substring(0,caja.getText().length()-1));
    }

    public void btnDiv (View v){
        guardar = caja.getText().toString();
        caja.setText("");
        op = "/";
    }

    public void btnMul (View v){
        guardar = caja.getText().toString();
        caja.setText("");
        op = "*";
    }

    public void btnRest (View v){
        guardar = caja.getText().toString();
        caja.setText("");
        op = "-";
    }

    public void btnSum (View v){
        guardar = caja.getText().toString();
        caja.setText("");
        op = "+";
    }

    public void btnPunto (View v){
        if(!caja.getText().toString().contains("."))
            caja.setText(caja.getText()+".");
    }

    public void btnIgual (View v){
        if(op!=" ") {
            double n1 = Double.parseDouble(guardar);
            double n2 = Double.parseDouble(caja.getText().toString());
            double res = 0;
            switch (op) {
                case "%" :
                    res = n1%n2;break;
                case "/" :
                    res = n1/n2;break;
                case "*" :
                    res = n1*n2;break;
                case "-" :
                    res = n1-n2;break;
                case "+" :
                    res = n1+n2;break;
                default : break;
            }
            caja.setText(Double.toString(res));
        }
    }


}