package com.example.yangkai.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText input = (EditText) findViewById(R.id.input2);
        Button b = (Button) findViewById(R.id.convert2);
        final TextView output = (TextView) findViewById(R.id.output2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double rmb = Double.parseDouble(input.getText().toString());
                Double sgd = rmb * 4.80;
                output.setText("¥" + sgd);
            }
        });
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
