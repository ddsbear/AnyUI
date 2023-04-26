package com.dds.anyui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dds.studiodemo.TabbedActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NavDraActivity(View view) {
        startActivity(new Intent(this, TabbedActivity.class));
    }

    public void recyclerView(View view) {
        startActivity(new Intent(this, TestActivity.class));

    }

    public void TestAnimation(View view) {
    }
}
