package com.example.katarzkubat.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class SearchActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        View record1 = (Button) findViewById(R.id.record1);
        record1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent record1Intent = new Intent(SearchActivity.this, PlaynowActivity.class);
                startActivity(record1Intent);
            }
        });
    }
}
