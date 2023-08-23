package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private FimDatabase db;
    private Button browseStoreButton, employeeLoginButton;
    private EditText employeeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(), FimDatabase.class, "floor-database").build();
        new PopulateDatabaseTask().execute();

        browseStoreButton = findViewById(R.id.browse_stores_button);
        employeeLoginButton = findViewById(R.id.employee_login_button);
        //employeeId = findViewById(R.id.employeeId);

        browseStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeListIntent = new Intent(MainActivity.this, StoreListActivity.class);
                startActivity(storeListIntent);
            }
        });

        employeeLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginEmployee();
            }
        });
    }

    private void populateDatabaseIfEmpty() {
        // Check if the database is empty
        if (db.storeDao().getAll().isEmpty()) {
            // Insert stores
            Store store1 = new Store(1, "Store 1");
            Store store2 = new Store(2, "Store 2");
            Store store3 = new Store(3, "Store 3");
            db.storeDao().insert(store1);
            db.storeDao().insert(store2);
            db.storeDao().insert(store3);

            // Insert floors for store 1
            Floor store1Floor1 = new Floor(1, 1, "Floor 1", "Hardwood", "Solid", "Oak", "200", "Brand1", 10.99, "Wood", "Red Oak", true);
            Floor store1Floor2 = new Floor(2, 1, "Floor 2", "Laminate", "Plank", "Walnut", "150", "Brand2", 5.99, "Composite", "Walnut", false);
            db.floorDao().insert(store1Floor1);
            db.floorDao().insert(store1Floor2);

            // Insert floors for store 2
            Floor store2Floor1 = new Floor(3, 2, "Floor 1", "Vinyl", "Tile", "Ceramic", "100", "Brand3", 3.99, "PVC", "Ceramic", true);
            Floor store2Floor2 = new Floor(4, 2, "Floor 2", "Engineered", "Wood", "Hickory", "250", "Brand4", 15.99, "Wood", "Hickory", false);
            db.floorDao().insert(store2Floor1);
            db.floorDao().insert(store2Floor2);

            // Insert floors for store 3
            Floor store3Floor1 = new Floor(5, 3, "Floor 1", "Bamboo", "Solid", "Natural", "300", "Brand5", 8.99, "Bamboo", "Natural", true);
            Floor store3Floor2 = new Floor(6, 3, "Floor 2", "Cork", "Plank", "Cork Oak", "180", "Brand6",
                    6.99, "Cork", "Cork Oak", false);
            db.floorDao().insert(store3Floor1);
            db.floorDao().insert(store3Floor2);
        }
    }

    private void LoginEmployee() {
        String id = employeeId.getText().toString();
    }

    private class PopulateDatabaseTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            populateDatabaseIfEmpty();
            return null;
        }
    }
}