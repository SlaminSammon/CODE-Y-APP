package com.example.flyingdoomstache.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AlgorithmsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String passValue = "";
    private Spinner spinner;
    private static final String[]paths = {"Bubble Sort", "Selection Sort", "Insertion Sort", "Quick Sort",
            "Merge Sort", "Counting Sort"};
    private Spinner spinner2;
    private static final String[]paths2 = {"Linear Search", "Binary Search", "Breadth-First-Search", "Depth-First-Search"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithms);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = (Spinner)findViewById(R.id.spinner_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AlgorithmsActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        spinner2 = (Spinner)findViewById(R.id.spinner_item_2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(AlgorithmsActivity.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        // On selecting a spinner item
        passValue = parent.getItemAtPosition(position).toString();
    }
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

    public void beenClicked(View view){
        Intent intent = new Intent(this, checkPass.class);
        intent.putExtra("value",passValue);
        startActivity(intent);
    }
}
