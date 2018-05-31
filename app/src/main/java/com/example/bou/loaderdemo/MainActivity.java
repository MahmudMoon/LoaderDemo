package com.example.bou.loaderdemo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportLoaderManager().initLoader(0,null,loaderCallbacks);
    }

    LoaderManager.LoaderCallbacks loaderCallbacks = new LoaderManager.LoaderCallbacks<List<String>>(){

        public Loader onCreateLoader(int id, @Nullable Bundle args) {
            Log.d("Test","LOAD_started");
            return new StringLoader(getApplicationContext());
        }

        @Override
        public void onLoadFinished(@NonNull Loader<List<String>> loader, List<String> data) {
            Log.d("Test","LOAD_finished" + Integer.toString(data.size()));
        }



        @Override
        public void onLoaderReset(@NonNull Loader loader) {

        }
    };

}
