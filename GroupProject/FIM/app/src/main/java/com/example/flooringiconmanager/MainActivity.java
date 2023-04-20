package com.example.flooringiconmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button userLogin, employeeLogin;
    private EditText emplyeeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLogin = findViewById(R.id.user);
        employeeLogin = findViewById(R.id.employee);
        emplyeeId = findViewById(R.id.employeeId);

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoreSelection.class);
                intent.putExtra("employ", 0);
                startActivity(intent);
            }
        });

        employeeLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                LoginEmployee();
            }
        });
    }

    private void LoginEmployee(){
        String id = emplyeeId.getText().toString();
    }
}
