package com.example.factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView txt1,txt2;
EditText num;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        num = (EditText) findViewById(R.id.number);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = num.getText().toString();
                int fact=1;
                if(input.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                    txt2.setVisibility(view.INVISIBLE);
                }
                else
                {
                    int num = Integer.parseInt(input);
                    for(int i=1 ; i<=num ;i++)
                    {
                        fact=fact*i;
                    }
                    txt2.setText("Factorial"+" "+":"+" "+fact);
                    txt2.setVisibility(view.VISIBLE);
                }
            }
        });

    }
}
