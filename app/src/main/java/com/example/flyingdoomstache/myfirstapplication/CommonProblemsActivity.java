package com.example.flyingdoomstache.myfirstapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CommonProblemsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinnerInterview;
    private static final String[]paths = {"Queue using 2 Stacks", "String Palindrome", "Rotated Array", "ParseInt","SquareRoot"};
    private Spinner spinnerPuzzles;
    private static final String[]paths2 = {"Towers of Hanoi", "Dining Philosiphers", "Traveling Salesman",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_problems);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinnerInterview = (Spinner)findViewById(R.id.spinner_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CommonProblemsActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerInterview.setAdapter(adapter);
        spinnerInterview.setOnItemSelectedListener(this);

        spinnerPuzzles = (Spinner)findViewById(R.id.spinner_item_2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(CommonProblemsActivity.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPuzzles.setAdapter(adapter2);
        spinnerPuzzles.setOnItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
    }
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}
