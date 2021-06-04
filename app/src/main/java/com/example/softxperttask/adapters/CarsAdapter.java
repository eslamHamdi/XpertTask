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

import java.util.Objects;

public class CarsAdapter extends ListAdapter<DataItem,CarsAdapter.CarsViewHolder> {

    CarItemBinding binding;

    protected CarsAdapter(@NonNull @NotNull DiffUtil.ItemCallback<DataItem> diffCallback) {
        super(diffCallback);
    }

    public static class CarsViewHolder extends RecyclerView.ViewHolder
    {
        CarItemBinding binding;

        public CarsViewHolder(@NonNull @NotNull CarItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
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

        DataItem item = this.getItem(position);
        holder.binding.setCarItem(item);
        holder.binding.executePendingBindings();
    }

    public static class DiffCallBack extends DiffUtil.ItemCallback<DataItem>
    {

        @Override
        public boolean areItemsTheSame(@NonNull @NotNull DataItem oldItem, @NonNull @NotNull DataItem newItem) {
            return oldItem.getImageUrl().equals(newItem.getImageUrl());
        }

        @Override
        public boolean areContentsTheSame(@NonNull @NotNull DataItem oldItem, @NonNull @NotNull DataItem newItem) {
            return Objects.equals(oldItem, newItem);
        }
    }





}
