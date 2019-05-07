package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Button btnsumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
        btnsumar=(Button)findViewById(R.id.btn1);
        btnsumar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        int valor1 = Integer.parseInt(et1.getText().toString());
        int valor2 = Integer.parseInt(et2.getText().toString());
        int suma=valor1+valor2;
        tv1.setText(suma+" ");
    }


}
