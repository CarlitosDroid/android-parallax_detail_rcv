package com.carlitosdroid.parallaxdetailrcv;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.carlitosdroid.parallaxdetailrcv.model.CandyEntity;
import com.carlitosdroid.parallaxdetailrcv.view.adapter.CandyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvFood;
    private List<CandyEntity> objectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        rcvFood = (RecyclerView) findViewById(R.id.rcvFood);
        rcvFood.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvFood.setLayoutManager(linearLayoutManager);

        initData();

        CandyAdapter favoriteAdapter = new CandyAdapter(this, objectList);
        rcvFood.setAdapter(favoriteAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initData(){
        objectList.add(new CandyEntity(true, "CustomCollapsingToolbar"));
        objectList.add(new CandyEntity(true, "ImageCollapsingToolbar"));
        objectList.add(new CandyEntity(true, "Kitkat"));
        objectList.add(new CandyEntity(true, "Marshmallow"));
        objectList.add(new CandyEntity(true, "Nougat"));
        objectList.add(new CandyEntity(true, "Oreo"));
        objectList.add(new CandyEntity(true, "Jelly Bean"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
