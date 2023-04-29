package edu.qc.seclass.fim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StoreListAdapter extends RecyclerView.Adapter<StoreListAdapter.StoreViewHolder> {

    private List<Store> stores;
    private final OnStoreClickListener listener;

    public StoreListAdapter(OnStoreClickListener listener) {
        this.listener = listener;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.store_list_item, parent, false);
        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {
        Store store = stores.get(position);
        holder.storeName.setText(store.getName());
        holder.itemView.setOnClickListener(v -> listener.onStoreClick(store));
    }

    @Override
    public int getItemCount() {
        return stores != null ? stores.size() : 0;
    }

    static class StoreViewHolder extends RecyclerView.ViewHolder {
        TextView storeName;

        StoreViewHolder(@NonNull View itemView) {
            super(itemView);
            storeName = itemView.findViewById(R.id.store_name);
        }
    }

    public interface OnStoreClickListener {
        void onStoreClick(Store store);
    }
}

