package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button btn;
String user1 = "midhun";
String pswd2 = "midhun123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pswd);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                String user = username.getText().toString();
                String pswd = password.getText().toString();

                if(user.isEmpty() || pswd.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Enter the Username and password",Toast.LENGTH_SHORT).show();
                }
                else if((user.equals(user1))&&(pswd.equals(pswd2)))
                {
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Incorrect Username and Password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
