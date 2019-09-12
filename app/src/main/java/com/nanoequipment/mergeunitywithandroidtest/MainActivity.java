package com.nanoequipment.mergeunitywithandroidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_LOC_ID = "arguments";
    private String array_spinner[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.buttonTest)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UnityHolderActivity.class);

                array_spinner = new String[5];
                array_spinner[0] = "option 1";
                array_spinner[1] = "option 2";
                array_spinner[2] = "option 3";
                array_spinner[3] = "option 4";
                array_spinner[4] = "option 5";

                Spinner s = (Spinner) findViewById(R.id.spnGlasses);

                ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),
                        android.R.layout.simple_spinner_item, array_spinner);
                s.setAdapter(adapter);

                startActivity(intent);
            }
        });
    }
}
