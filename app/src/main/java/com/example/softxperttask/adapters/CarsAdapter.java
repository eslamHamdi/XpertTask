package com.example.softxperttask.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.softxperttask.databinding.CarItemBinding;
import com.example.softxperttask.models.DataItem;

public class CarsAdapter extends ListAdapter<DataItem,CarsAdapter> {

    CarItemBinding binding;
    public Class CarsViewHolder extends View
    {



    }

    public CarsAdapter(@NonNull @org.jetbrains.annotations.NotNull DiffUtil.ItemCallback<DataItem> diffCallback, CarItemBinding binding, Class carsViewHolder) {
        super(diffCallback);
        this.binding = binding;
        CarsViewHolder = carsViewHolder;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull CarsAdapter holder, int position) {

    }


    public CarItemBinding getBinding() {
        return binding;
    }

    public CarItemBinding setBinding() {
        return binding;
    }
}
