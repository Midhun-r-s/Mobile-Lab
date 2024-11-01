package com.example.multiplicationtable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  TextView textView;
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    textView = (TextView) findViewById(R.id.textView);
    button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i = new Intent(MainActivity2.this, MainActivity.class);
                                          startActivity(i);
                                      }
                                  });
    Bundle b = getIntent().getExtras();
    int num = Integer.parseInt(b.getString("number"));
    int r = Integer.parseInt(b.getString("range"));

    for(int i=1;i<=r;i++)
    {
        String res = "•"+" "+num+"x"+i+"="+(num*i)+"\n";
        textView.append(res);
    }


    }
}
