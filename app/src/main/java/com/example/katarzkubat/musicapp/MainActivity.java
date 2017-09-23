package com.example.katarzkubat.musicapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;
//import android.support.v7.widget.SearchView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView search = (SearchView) findViewById(R.id.search_view);
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }

        });

        View etudes = (Button) findViewById(R.id.button_etudes);
        etudes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent etudesIntent = new Intent(MainActivity.this, EtudesActivity.class);
                startActivity(etudesIntent);
            }
        });


        View mazurkas = (Button) findViewById(R.id.button_mazurkas);
        mazurkas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent mazurkasIntent = new Intent(MainActivity.this, MazurkasActivity.class);
                startActivity(mazurkasIntent);
            }
        });


        View polonaises = (Button) findViewById(R.id.button_polonaises);
        polonaises.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent polonaisesIntent = new Intent(MainActivity.this, PolonaisesActivity.class);
                startActivity(polonaisesIntent);
            }
        });

        View waltzes = (Button) findViewById(R.id.button_waltzes);
        waltzes.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                Intent waltzesIntent = new Intent(MainActivity.this, WaltzesActivity.class);
                startActivity(waltzesIntent);
            }
        });

        View preludes = (Button) findViewById(R.id.button_preludes);
        preludes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent preludesIntent = new Intent(MainActivity.this, PreludesActivity.class);
                startActivity(preludesIntent);
            }
        });

        View scherzos = (Button) findViewById(R.id.button_scherzos);
        scherzos.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                Intent scherzosIntent = new Intent(MainActivity.this, ScherzosActivity.class);
                startActivity(scherzosIntent);
            }
        });

        View List = (Button) findViewById(R.id.button_other);
        List.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                Intent ListIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(ListIntent);
            }
        });
    }
}
