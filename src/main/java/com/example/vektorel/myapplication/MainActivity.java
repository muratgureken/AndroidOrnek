package com.example.vektorel.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtPass;
    Spinner spn;
    String s  = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPass  = (EditText) findViewById(R.id.txtEDTpass);
        spn = (Spinner) findViewById(R.id.txtEDT);
        Button btnLogint = (Button) findViewById(R.id.btnLogin);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s = parent.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnLogint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
    }

    private void Login() {
        boolean errExist = true;
        if (s.toString().equals(Utility.Names.Akin.toString())){
            if (edtPass.getText().toString().equals("123")){
                Toast.makeText(getApplicationContext(),"Giriş başarılı",Toast.LENGTH_SHORT).show();
                errExist = false;
            }
        }
        if (errExist == true){
            Toast.makeText(getApplicationContext(),"Giriş başarısız", Toast.LENGTH_SHORT).show();
        }
    }
}
