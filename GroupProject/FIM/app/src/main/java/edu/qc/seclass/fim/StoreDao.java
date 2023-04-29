package edu.qc.seclass.fim;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StoreDao {
    @Query("SELECT * FROM stores")
    List<Store> getAll();

    @Insert
    long insert(Store store); // Returns the newly generated ID
}

