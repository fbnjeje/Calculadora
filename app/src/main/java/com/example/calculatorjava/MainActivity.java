package com.example.calculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText num1,num2,Resultado2;

    TextView tv1;
    Button Sumar,Multipicar,restar,dividir,Factorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        Resultado2 = (EditText) findViewById(R.id.Resultado12);

        Sumar = (Button) findViewById(R.id.btnSumar);
        Multipicar = (Button) findViewById(R.id.btnMultiplicar);
        dividir = (Button) findViewById(R.id.btnDividir);
        restar = (Button) findViewById(R.id.btnRestar);
        Factorial = (Button) findViewById(R.id.btnFactorial);



        Sumar.setOnClickListener(this);
        Multipicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        restar.setOnClickListener(this);
        Factorial.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        Float n1,res;
        Float n2;

        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        res = n1+n2;

        Resultado2.setText("El resultado es: "+ res);

        switch (view.getId()){

            case R.id.btnSumar:

                res = n1+n2;

                Resultado2.setText("El resultado es: "+ res);

                break;
            case R.id.btnRestar:
                res = n1-n2;

                Resultado2.setText("El resultado es: "+ res);
                break;
            case R.id.btnMultiplicar:
                res = n1*n2;

                Resultado2.setText("El resultado es: "+ res);
                break;
            case R.id.btnDividir:
                res = n1/n2;

                Resultado2.setText("El resultado es: "+ res);
                break;
            case  R.id.btnFactorial:
                break;

        }






    }
}