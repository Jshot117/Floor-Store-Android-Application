package edu.qc.seclass.fim;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FloorDao {
    @Query("SELECT * FROM floors")
    List<Floor> getAll();

    @Insert
    void insert(Floor floor);

    @Update
    void update(Floor floor);

    @Delete
    void delete(Floor floor);

    @Query("SELECT * FROM floors WHERE category = :category AND type = :type")
    List<Floor> getByCategoryAndType(String category, String type);

    @Query("SELECT * FROM floors WHERE store_id = :storeId")
    List<Floor> getFloorsForStore(int storeId);

}

