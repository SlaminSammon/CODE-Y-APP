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

public class DataStructuresActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinnerLinear;
    private static final String[]paths = {"Linked List", "Doubly Linked List", "Circularly Linked List", "Skip List"};
    private Spinner spinnerTrees;
    private static final String[]paths2 = {"Default Tree", "BST", "Balanced BST", "B Tree", "Red-Black Tree"};
    private Spinner spinnerHash;
    private static final String[]paths3 = {"Hash Table", "Hash Tree", "Double Hashing",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        spinnerLinear = (Spinner)findViewById(R.id.spinner_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(DataStructuresActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLinear.setAdapter(adapter);
        spinnerLinear.setOnItemSelectedListener(this);

        spinnerTrees = (Spinner)findViewById(R.id.spinner_item_2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(DataStructuresActivity.this,
                android.R.layout.simple_spinner_item,paths2);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTrees.setAdapter(adapter2);
        spinnerTrees.setOnItemSelectedListener(this);

        spinnerHash = (Spinner)findViewById(R.id.spinner_item_3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(DataStructuresActivity.this,
                android.R.layout.simple_spinner_item,paths3);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHash.setAdapter(adapter3);
        spinnerHash.setOnItemSelectedListener(this);

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
