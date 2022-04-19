package com.example.room;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.room.database.PersonneEntity;
import com.example.room.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<PersonneEntity> arrayAdapter;
    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}