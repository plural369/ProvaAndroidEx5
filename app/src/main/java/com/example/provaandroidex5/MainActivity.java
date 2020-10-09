package com.example.provaandroidex5;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TelaPrincipal();

    }

    public void TelaPrincipal() {
        setContentView(R.layout.activity_main);
        Button btImc, btFa;

        btImc = (Button) findViewById(R.id.btImc);
        btFa = (Button) findViewById(R.id.btFa);

        btImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaImc();
            }
        });

        btFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaFa();
            }
        });


    }


    public void TelaImc() {
        setContentView(R.layout.imc);
        final EditText edAltura, edPeso;
        Button btIMC ,btVoltarIMC;
        final TextView txtResultado1;

        edAltura = (EditText) findViewById(R.id.edAltura);
        edPeso = (EditText) findViewById(R.id.edPeso);
        btIMC = (Button) findViewById(R.id.btIMC);
        btVoltarIMC = (Button) findViewById(R.id.btVoltarIMC);
        txtResultado1 = (TextView) findViewById(R.id.txtResultado1);

        btIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Altura = Double.parseDouble(edAltura.getText().toString());
                double Peso = Double.parseDouble(edPeso.getText().toString());

                double imc =  Peso/(Altura*Altura );

                txtResultado1.setText("IMC: "+ imc);
            }
        });

        btVoltarIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaPrincipal();
            }
        });

    }

    public void TelaFa() {
        setContentView(R.layout.graus);

        final EditText edCelsius;
        final TextView txtFA;
        Button btCalcularFA, btPrincipalFA;

        edCelsius = (EditText) findViewById(R.id.edCelsius);
        txtFA = (TextView) findViewById(R.id.txtFA);
        btCalcularFA = (Button) findViewById(R.id.btCalcularFA);
        btPrincipalFA = (Button) findViewById(R.id.btPrincipalFA);

        btCalcularFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celsius;
                celsius = Double.parseDouble(edCelsius.getText().toString());
                double calculo;
                calculo = (celsius*1.8)+32;
                txtFA.setText("Teste: "+ calculo);
            }
        });

        btPrincipalFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaPrincipal();
            }
        });

    }
}