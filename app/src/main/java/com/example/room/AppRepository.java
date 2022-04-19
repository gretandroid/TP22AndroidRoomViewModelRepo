package com.example.room;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.room.database.AppDatabase;
import com.example.room.database.PersonneEntity;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//Ici on va communiquer avec la base de données
// c'est un singleton lors de son appel
public class AppRepository {
    private static AppRepository instance;
    public LiveData<List<PersonneEntity>> mPersons;
    private AppDatabase database;
    private Executor executor = Executors.newSingleThreadExecutor();

    public AppRepository(Context context) {
        database = AppDatabase.getInstance(context);
        mPersons = getAllPersons();
    }

    private LiveData<List<PersonneEntity>> getAllPersons() {
        return database.personneDao().getAll();
    }
}
