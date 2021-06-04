package com.example.softxperttask;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.softxperttask.adapters.CarsAdapter;
import com.example.softxperttask.databinding.ActivityMainBinding;
import com.example.softxperttask.models.DataItem;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    CarsAdapter adapter;
    ActivityMainBinding binding;
    MainActivityViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DiffUtil.ItemCallback<DataItem> DiffCallBack = new DiffUtil.ItemCallback<DataItem>() {
            @Override
            public boolean areItemsTheSame(@NonNull @NotNull DataItem oldItem, @NonNull @NotNull DataItem newItem) {
                return oldItem.getImageUrl().equals(newItem.getImageUrl());
            }

            @Override
            public boolean areContentsTheSame(@NonNull @NotNull DataItem oldItem, @NonNull @NotNull DataItem newItem) {
                return Objects.equals(oldItem, newItem);
            }
        };


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        viewModel.getCarsList();

        RecyclerView recyclerView = binding.recycler;
        adapter = new CarsAdapter(DiffCallBack);
        recyclerView.setAdapter(adapter);

        viewModel.carsData.observe(this, new Observer<List<DataItem>>() {
            @Override
            public void onChanged(List<DataItem> dataItems) {
                adapter.submitList(dataItems);

            }
        });

        viewModel.errorMsg.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }
        });


    }



}