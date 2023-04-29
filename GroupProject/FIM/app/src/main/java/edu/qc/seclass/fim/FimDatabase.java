package edu.qc.seclass.fim;

import static java.time.chrono.MinguoChronology.INSTANCE;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.List;

@Database(entities = {Floor.class, Store.class}, version = 1, exportSchema = false)
public abstract class FimDatabase extends RoomDatabase {
    public abstract FloorDao floorDao();
    public abstract StoreDao storeDao();
    private static volatile FimDatabase sInstance;
    public static synchronized FimDatabase getInstance(Context context) {
        if (sInstance == null) {
            sInstance = Room.databaseBuilder(context.getApplicationContext(),
                            FimDatabase.class, "fim-database")
                    .build();
        }
        return sInstance;
    }


}

