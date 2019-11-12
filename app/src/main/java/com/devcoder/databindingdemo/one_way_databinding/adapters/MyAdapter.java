package com.devcoder.databindingdemo.one_way_databinding.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.devcoder.databindingdemo.R;
import com.devcoder.databindingdemo.databinding.ItemRowBinding;
import com.devcoder.databindingdemo.one_way_databinding.interfaces.CustomClickListener;
import com.devcoder.databindingdemo.one_way_databinding.models.DataModel;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements CustomClickListener {

    private ArrayList<DataModel> list;
    private Activity activity;

    public MyAdapter(ArrayList<DataModel> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_row, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel dataModel = list.get(position);
        holder.bind(dataModel);
        holder.binding.setItemClickListener(this);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void cardClicked(DataModel dataModel) {
        Toast.makeText(activity, "You clicked " + dataModel.getAndroidName(),
                Toast.LENGTH_LONG).show();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ItemRowBinding binding;

        ViewHolder(@NonNull ItemRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(DataModel dataModel) {
            binding.setModel(dataModel);
            binding.executePendingBindings();
        }
    }
}
