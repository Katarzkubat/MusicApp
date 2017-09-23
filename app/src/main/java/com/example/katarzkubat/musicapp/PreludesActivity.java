package com.example.katarzkubat.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by katarz.kubat on 07.05.2017.
 */

public class PreludesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preludes);

        View record1 = (Button) findViewById(R.id.record1);
        record1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent record1Intent = new Intent(PreludesActivity.this, PlaynowActivity.class);
                startActivity(record1Intent);
            }
        });

    }
}