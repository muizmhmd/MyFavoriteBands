package com.muiz.myfavoritebands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBands;
    private ArrayList<Band> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBands = findViewById(R.id.rv_bands);
        rvBands.setHasFixedSize(true);

        list.addAll(BandsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBands.setLayoutManager(new LinearLayoutManager(this));
        ListBandAdapter listBandAdapter = new ListBandAdapter(list);
        rvBands.setAdapter(listBandAdapter);

        listBandAdapter.setOnItemClickCallback(new ListBandAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Band data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData(Band band){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_BAND_NAME, band.getName());
        intent.putExtra(DetailActivity.EXTRA_BAND_GENRE, band.getGenre());
        intent.putExtra(DetailActivity.EXTRA_BAND_DETAIL, band.getDetail());
        intent.putExtra(DetailActivity.EXTRA_BAND_IMAGE, band.getPhoto());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }





}
