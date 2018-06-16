package com.example.yangkai.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText input = (EditText) findViewById(R.id.input1);
        Button a = (Button) findViewById(R.id.convert1);
        final TextView output = (TextView) findViewById(R.id.output1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double sgd = Double.parseDouble(input.getText().toString());
                Double usd = sgd * 1.35;
                output.setText("$" + usd);
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        Button more = (Button) findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }

}