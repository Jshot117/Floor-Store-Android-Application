package edu.qc.seclass.fim;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StoreListActivity extends AppCompatActivity {

    private FimDatabase db;
    private RecyclerView storeListRecyclerView;
    private StoreListAdapter storeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);

        db = FimDatabase.getInstance(this);
        storeListRecyclerView = findViewById(R.id.store_list);
        storeListAdapter = new StoreListAdapter(this::onStoreSelected);

        storeListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        storeListRecyclerView.setAdapter(storeListAdapter);

        fetchStores();
    }

    private void fetchStores() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            List<Store> stores = db.storeDao().getAll();
            runOnUiThread(() -> storeListAdapter.setStores(stores));
        });
    }


    private void onStoreSelected(Store store) {
        Intent storeIntent = new Intent(StoreListActivity.this, StoreActivity.class);
        storeIntent.putExtra("store_id", store.getId());
        startActivity(storeIntent);
    }

}

