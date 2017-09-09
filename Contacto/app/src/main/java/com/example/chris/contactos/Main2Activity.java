package com.example.chris.contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;


public class Main2Activity extends AppCompatActivity implements Serializable{

    EditText txtU,txtE,txtTW,txtTel,txtF;
    Button btnGuardar;
    //Intent i=getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTitle("Nuevo Contacto");
        setContentView(R.layout.activity_main2);

        txtU=(EditText) findViewById(R.id.txtUsuario);
        txtE=(EditText) findViewById(R.id.txtmail);
        txtTW=(EditText)findViewById(R.id.txtTwitter);
        txtTel=(EditText)findViewById(R.id.txtTel);
        txtF=(EditText)findViewById(R.id.txtDate);
        btnGuardar=(Button)findViewById(R.id.btnGuardar);



        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacto c=new Contacto();
                c.setUsuario(txtU.getText().toString());
                c.setEmail(txtE.getText().toString());
                c.setTw(txtTW.getText().toString());
                c.setTel(Integer.parseInt(txtTel.getText().toString()));
                c.setFechaN(txtF.getText().toString());

                Intent i=new Intent();
                i.putExtra("param",c);
                setResult(RESULT_OK,i);

                Toast.makeText(getApplication(),"Registrado",Toast.LENGTH_LONG).show();
                finish();

            }
        });




    }
}
