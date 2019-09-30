package com.app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1=(TextView)findViewById(R.id.txt_Resultado);
        Intent i = getIntent();
        String a = i.getStringExtra("resultado");
        txt1.setText(a);

    }

    public void regresar(View view){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
