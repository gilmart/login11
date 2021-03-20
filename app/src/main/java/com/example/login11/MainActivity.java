package com.example.login11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Atributos
    EditText cajaHorasTrabajadas;
    Button botonCalcularSalario;
    TextView cajaResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaHorasTrabajadas=findViewById(R.id.horas);
        botonCalcularSalario=findViewById(R.id.botonCalcular);
        cajaResultado=findViewById(R.id.resultado);

        botonCalcularSalario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int horasTrabajadas = Integer.parseInt(cajaHorasTrabajadas.getText().toString());

                if(horasTrabajadas<=40)
                {
                    int salario=horasTrabajadas*20000;
                    cajaResultado.setText("su salario es de: $"+salario);
                }
                else
                {
                    final int SALARIOBASE=40*20000;
                    int salarioExtra =(horasTrabajadas-40)*25000;
                }


            }
        });






    }
}