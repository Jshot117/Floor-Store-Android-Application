package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button userLogin, employeeLogin;
    private EditText employeeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLogin = findViewById(R.id.user);
        employeeLogin = findViewById(R.id.employee);
        employeeId = findViewById(R.id.employeeId);

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoreSelectionActivity.class);
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
        String id = employeeId.getText().toString();
    }
}