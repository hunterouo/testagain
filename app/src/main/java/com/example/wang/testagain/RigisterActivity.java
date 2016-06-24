package com.example.wang.testagain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.R;

public class RigisterActivity extends AppCompatActivity {

    @Override
    //private Spinner spinner1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigister);
        Spinner spinner_items = (Spinner) findViewById(R.id.spinner1);
        //從res/values/string.xml讀取資料到Spinner
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.items,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_items.setAdapter(adapter);


        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RigisterActivity.this,loginactivity.class );
                startActivity(intent);
            }
        });
    }
}
