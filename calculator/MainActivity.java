package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button bt00,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,add,sub,div,mul,eq,mod,clear,dot;
TextView res;
float first,second;
Boolean add1=false,sub1=false,div1=false,mul1=false,mod1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt00 = (Button) findViewById(R.id.bt00);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        add = (Button) findViewById(R.id.plus);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.divide);
        eq = (Button) findViewById(R.id.equal);
        mod = (Button) findViewById(R.id.mod);
        clear = (Button) findViewById(R.id.clear);
        dot = (Button) findViewById(R.id.dot);
        res = (TextView) findViewById(R.id.textView);

        bt00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"00");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+"9");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(" ");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res!=null)
                {
                    first = Float.parseFloat(res.getText().toString());
                    add1=true;
                }
                res.setText(" ");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res!=null)
                {
                    first = Float.parseFloat(res.getText().toString());
                    sub1=true;
                }
                res.setText(" ");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res!=null)
                {
                    first = Float.parseFloat(res.getText().toString());
                    mul1=true;
                }
                res.setText(" ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res!=null)
                {
                    first = Float.parseFloat(res.getText().toString());
                    div1=true;
                }
                res.setText(" ");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res!=null)
                {
                    first = Float.parseFloat(res.getText().toString());
                    mod1=true;
                }
                res.setText(" ");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = Float.parseFloat(res.getText().toString());
                if(add1==true)
                {
                    res.setText(String.valueOf(first+second));
                    add1=false;
                }
                if(sub1==true)
                {
                    res.setText(String.valueOf(first-second));
                    sub1 = false;
                }
                if(mul1==true)
                {
                    res.setText(String.valueOf(first*second));
                    mul1 = false;
                }
                if(div1==true)
                {
                    res.setText(String.valueOf(first/second));
                    div1 = false;
                }
                if(sub1==true)
                {
                    res.setText(String.valueOf(first%second));
                    mod1 = false;
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText()+".");
            }
        });

    }
}
