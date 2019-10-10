package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     public void sendNow(View view)
     {
         Toast.makeText(this, "Sending data from app", Toast.LENGTH_SHORT).show();

     }
    public void reciveNow(View view)
    {
        Toast.makeText(this, "Reciving data from app", Toast.LENGTH_SHORT).show();

    }
    public void deleteNow(View view)
    {
        Toast.makeText(this, "Deleting data from app", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
