package com.ahmad.github_helps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class A1_TimeZone extends AppCompatActivity {

    EditText registerEmail;
    TextInputEditText regPassword;
    Button regBtn;
//    String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1_timezone_activity);

        /*        Spinner myspinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, dayOfWeek);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        myspinner.setAdapter(adapter);
*/
        registerEmail = (EditText) findViewById(R.id.register_email);
        regPassword = (TextInputEditText) findViewById(R.id.reg_password);
        regBtn = (Button) findViewById(R.id.reg_btn);
        registerEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        regPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Registration was successful!", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
