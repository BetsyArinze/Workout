package com.hfad.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method to start DetailActivity when the button is clicked
    public void onShowDetails(View view){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}