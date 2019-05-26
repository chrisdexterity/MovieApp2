package com.example.movieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrid=findViewById(R.id.gridMovies);

        //create our custom adapter
        MoviesRet adapter=new MoviesRet(this);

        mGrid.setAdapter(adapter);

        //set on item click listener
        mGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //launch intent
                Intent details=new Intent(getApplicationContext(),DetailsActivity.class);
                //pass the clicked index position
                details.putExtra("pos",position);
                startActivity(details);
            }
        });
    }
}
