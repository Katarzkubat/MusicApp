package com.example.katarzkubat.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by katarz.kubat on 07.05.2017.
 */

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        View start = (Button) findViewById(R.id.button_start);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(EntryActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
