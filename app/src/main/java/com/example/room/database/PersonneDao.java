package com.example.room.database;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonneDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPersonne(PersonneEntity personneEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<PersonneEntity> personnes);

    @Delete
    void deletePersonne(PersonneEntity personneEntity);

    @Query("SELECT * FROM person WHERE id=:id")
    PersonneEntity getPersonneById(int id);

    @Query("SELECT * FROM person ORDER BY date DESC")
    LiveData<List<PersonneEntity>> getAll() ;

    @Query("DELETE FROM person")
    int deleteAll();

    @Query("SELECT count(*) FROM person")
    int getCount();
}
