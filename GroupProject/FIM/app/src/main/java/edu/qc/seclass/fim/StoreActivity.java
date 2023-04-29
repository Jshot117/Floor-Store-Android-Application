package edu.qc.seclass.fim;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StoreActivity extends AppCompatActivity {

    private int storeId;
    private FimDatabase db;
    private RecyclerView floorListRecyclerView;
    private FloorListAdapter floorListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Intent intent = getIntent();
        storeId = intent.getIntExtra("store_id", -1);

        if (storeId == -1) {
            // Handle the case when store_id is not available
            finish();
            return;
        }

        floorListRecyclerView = findViewById(R.id.floor_list);
        floorListAdapter = new FloorListAdapter(this);

        floorListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        floorListRecyclerView.setAdapter(floorListAdapter);

        db = FimDatabase.getInstance(this);

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            List<Floor> floorList = db.floorDao().getFloorsForStore(storeId);
            runOnUiThread(() -> {
                floorListAdapter.setFloorList(floorList);
            });
        });
    }
}
