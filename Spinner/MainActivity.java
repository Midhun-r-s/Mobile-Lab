package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner sp;
TextView txt;
String[] courses = {"DBMS","AI","CSC","DAA","Data Science","Deep Learning"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp =(Spinner) findViewById(R.id.spinner);
        txt = (TextView) findViewById(R.id.textView);

        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,courses);
        sp.setAdapter(a);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                txt.setText("Select course :"+courses[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txt.setText("No courses selected");
            }
        });

    }
}
