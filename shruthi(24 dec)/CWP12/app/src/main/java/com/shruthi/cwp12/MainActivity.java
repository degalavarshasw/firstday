package com.shruthi.cwp12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.shruthi.cwp12.R;

public class MainActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void normalSwitching(View view)
    {
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }
}