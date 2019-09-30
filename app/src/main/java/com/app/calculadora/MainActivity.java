package com.app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1, e2;
    private TextView txt1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.edit_Number1);
        e2 = (EditText) findViewById(R.id.edit_Number2);
        txt1 = (TextView) findViewById(R.id.txt_Resultado);
        rb1 = (RadioButton) findViewById(R.id.rb_Sumar);
        rb2 = (RadioButton) findViewById(R.id.rb_Restar);
        rb3 = (RadioButton) findViewById(R.id.rb_Dividir);
        rb4 = (RadioButton) findViewById(R.id.rb_Multiplicar);
    }

    public void calcularResultado(View view) {
        String val1 = e1.getText().toString();
        String val2 = e2.getText().toString();
        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);
        int resultado;

        if (rb1.isChecked() == true) {
            resultado=(num1 + num2);
        }
        else{ if(rb2.isChecked() == true) {
            resultado=(num1 - num2);
        }
        else{
            if(rb3.isChecked() == true) {
            resultado=(num1 / num2);
        }
        else
            resultado=(num1 * num2);
        }}

        Intent i= new Intent(this,Main2Activity.class);
        i.putExtra("resultado",String.valueOf(resultado));
        startActivity(i);
    }
}
