package com.example.softxperttask.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.softxperttask.R;
import com.example.softxperttask.databinding.CarItemBinding;
import com.example.softxperttask.models.DataItem;

import org.jetbrains.annotations.NotNull;

public class CarsAdapter extends ListAdapter<DataItem,CarsAdapter.CarsViewHolder> {

    CarItemBinding binding;

    protected CarsAdapter(@NonNull @NotNull DiffUtil.ItemCallback<DataItem> diffCallback) {
        super(diffCallback);
    }

    public static class CarsViewHolder extends RecyclerView.ViewHolder
    {


        public CarsViewHolder(@NonNull @NotNull CarItemBinding binding) {
            super(binding.getRoot());
        }
    }



    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.car_item,parent,false);
        return new CarsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CarsAdapter.CarsViewHolder holder, int position) {

    }




    public CarItemBinding getBinding() {
        return binding;
    }

    public CarItemBinding setBinding() {
        return binding;
    }
}
