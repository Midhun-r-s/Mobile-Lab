package com.example.multiplicationtable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText number,range;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     number=(EditText) findViewById(R.id.number);
     range= (EditText) findViewById(R.id.range);
     button=(Button) findViewById(R.id.button);


     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if (TextUtils.isEmpty(number.getText()) || TextUtils.isEmpty(range.getText())) {
                 Toast.makeText(MainActivity.this, "Please Enter the number and range", Toast.LENGTH_SHORT).show();
             }
             else {
                 Intent i = new Intent(MainActivity.this, MainActivity2.class);
                 String num = number.getText().toString();
                 String r = range.getText().toString();
                 i.putExtra("number", num);
                 i.putExtra("range", r);
                 startActivity(i);
             }
         }
     });


    }
}
