package com.example.darktosee.myfirstapplacation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bnt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt = (Button) findViewById(R.id.button);
        bnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent();

                intent.setClass(MainActivity.this,SecondActivity.class);

                startActivity(intent);
            }

        });


    }
}