package edu.qc.seclass.fim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FloorListAdapter extends RecyclerView.Adapter<FloorListAdapter.FloorViewHolder> {

    private List<Floor> floorList;
    private LayoutInflater inflater;

    public FloorListAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public FloorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.floor_item, parent, false);
        return new FloorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FloorViewHolder holder, int position) {
        if (floorList != null) {
            Floor current = floorList.get(position);
            holder.floorNameTextView.setText(current.getName());
            // Set other properties of the view - need an on click listener method for floor
        }
    }

    @Override
    public int getItemCount() {
        return floorList != null ? floorList.size() : 0;
    }

    public void setFloorList(List<Floor> floors) {
        this.floorList = floors;
        notifyDataSetChanged();
    }

    static class FloorViewHolder extends RecyclerView.ViewHolder {
        private TextView floorNameTextView;

        public FloorViewHolder(@NonNull View itemView) {
            super(itemView);
            floorNameTextView = itemView.findViewById(R.id.floor_name);
            // Initialize other views
        }
    }
}

