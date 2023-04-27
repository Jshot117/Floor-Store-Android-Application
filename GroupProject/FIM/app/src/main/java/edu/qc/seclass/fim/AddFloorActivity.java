package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddFloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_floor);

        EditText floor_name = findViewById(R.id.nameInput);
        EditText floor_color = findViewById(R.id.colorInput);
        EditText floor_size = findViewById(R.id.sizeInput);
        EditText floor_brand = findViewById(R.id.brandInput);
        EditText floor_price = findViewById(R.id.priceInput);

        Button add_btn = findViewById(R.id.addButton);
        Button cancel_btn = findViewById(R.id.cancelButton);
        Spinner store_select = findViewById(R.id.spinner_store);
        Spinner category_select = findViewById(R.id.spinner_category);
        Spinner type_select = findViewById(R.id.spinner_type);
        Spinner species_select = findViewById(R.id.spinner_species);

        // Array Adapters;
        ArrayAdapter<CharSequence> storeAd = ArrayAdapter.createFromResource(this,
                R.array.store_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> categoryAd = ArrayAdapter.createFromResource(this,
                R.array.category_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> typeAd = ArrayAdapter.createFromResource(this,
                R.array.stone_type_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> speciesAd = ArrayAdapter.createFromResource(this,
                R.array.wood_species_array, android.R.layout.simple_spinner_item);

        storeAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        store_select.setAdapter(storeAd);
        categoryAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        category_select.setAdapter(categoryAd);
        typeAd.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));
        type_select.setAdapter(typeAd);
        speciesAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        species_select.setAdapter(speciesAd);

        store_select.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }
            

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}