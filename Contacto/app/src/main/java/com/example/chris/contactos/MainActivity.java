package com.example.chris.contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable{

    Button btn;
    ArrayList<String> contacts;
    ListView lsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btnAgregar);
        lsv=(ListView) findViewById(R.id.lista);
        contacts=new ArrayList<>();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplication(),Main2Activity.class);
                startActivityForResult(i,1000);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Contacto c=(Contacto)data.getSerializableExtra("param");
            contacts.add(c.getUsuario()+" "+c.getEmail());
            ArrayAdapter<String> adp=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,contacts);
            lsv.setAdapter(adp);
        }else{
            Toast.makeText(getApplication(),"ERROR",Toast.LENGTH_LONG).show();
        }
    }
}
