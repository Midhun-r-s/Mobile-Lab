package com.example.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
String[] arr={"Dubai","Singapore","Japan","Abudabi","USA","Las Vegas","India","Europe","China","Tokyo"};
ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       lst = (ListView) findViewById(R.id.lst);

       ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
       lst.setAdapter(a);
    }
}
