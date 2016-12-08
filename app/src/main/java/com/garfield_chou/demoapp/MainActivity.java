package com.garfield_chou.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view){

        Log.i("Info", "Button Pressed!");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Toast.makeText(MainActivity.this, "Hi, " + nameEditText.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
