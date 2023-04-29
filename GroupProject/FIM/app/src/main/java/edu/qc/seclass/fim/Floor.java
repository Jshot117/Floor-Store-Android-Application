package edu.qc.seclass.fim;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(tableName = "floors", foreignKeys = @ForeignKey(entity = Store.class,
        parentColumns = "id",
        childColumns = "store_id",
        onDelete = ForeignKey.CASCADE))
public class Floor {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "store_id")
    public int storeId;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "category")
    public String category;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "color")
    public String color;

    @ColumnInfo(name = "size_in_square_feet")
    public String sizeSqFt;

    @ColumnInfo(name = "brand")
    public String brand;

    @ColumnInfo(name = "price")
    public double price;

    @ColumnInfo(name = "material")
    public String material;

    @ColumnInfo(name = "species")
    public String species;

    @ColumnInfo(name = "water_resistant")
    public boolean waterResistant;

    public Floor(int id, int storeId, String name, String category, String type, String color, String sizeSqFt, String brand,
                 double price, String material, String species, boolean waterResistant) {
        this.id = id;
        this.storeId = storeId;
        this.category = category;
        this.type = type;
        this.color = color;
        this.sizeSqFt = sizeSqFt;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.species = species;
        this.waterResistant = waterResistant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSizeSqFt() {
        return sizeSqFt;
    }

    public void setSizeSqFt(String size) {
        this.sizeSqFt = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }
}

