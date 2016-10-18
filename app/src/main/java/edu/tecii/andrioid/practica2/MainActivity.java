package edu.tecii.andrioid.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText etCapital,etInteres,etPeriodo;
    private TextView Monto;
    private TextView Interes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCapital=(EditText)findViewById(R.id.Capital);
        etInteres=(EditText)findViewById(R.id.intereses);
        etPeriodo=(EditText)findViewById(R.id.periodos);
        Monto=(TextView)findViewById(R.id.Monto);
        Interes=(TextView)findViewById(R.id.Interes);
    }

    public void calcular (View view){

        String capital=etCapital.getText().toString();
        String tasa=etInteres.getText().toString();
        String peri=etPeriodo.getText().toString();
        double nro1=Double.parseDouble(capital);
        double nro2=Double.parseDouble(tasa);
        double nro3=Double.parseDouble(peri);

        double  monto =nro1*Math.pow((1+nro2/100),nro3);
        double interes=monto-nro1;

        String resu="";
        String resu1="";

        resu="El monto total es:" +String.format("%8.2f\n",monto);
        resu1="El interes a pagar es:" +String.format("%8.2f\n",interes);


        Monto.setText(resu);
        Interes.setText(resu1);


    }
}
