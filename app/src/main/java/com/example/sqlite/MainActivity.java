package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textName,textAge;
    Switch aSwitch;
    Button btnAdd,btnView;
    ListView listView;
    StudentModel std;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.button);
        btnView = findViewById(R.id.button2);
        textName = findViewById(R.id.editTextName);
        textAge = findViewById(R.id.editTextNumber);
        aSwitch = findViewById(R.id.switch1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                std = new StudentModel(textName.getText().toString(), Integer.parseInt(textAge.getText().toString()), aSwitch.isChecked(), 1);
                Toast.makeText(MainActivity.this, std.toString(), Toast.LENGTH_LONG).show();
            }
            });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "View button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}