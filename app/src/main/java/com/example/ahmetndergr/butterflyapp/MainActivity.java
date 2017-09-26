package com.example.ahmetndergr.butterflyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button)findViewById(R.id.loginbutton);
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        final TextView success = (TextView)findViewById(R.id.successtext);

        loginButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                if((username.getText().toString().equals("Ali"))&&(password.getText().toString().equals("Veli"))){
                    success.setText(R.string.success);
                }else{
                    success.setText(R.string.unsuccess);
                }

            }
        });
    }
}
