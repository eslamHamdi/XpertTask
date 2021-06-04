package com.example.softxperttask.utils;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.softxperttask.R;

public class BindingAdapters {


    @BindingAdapter("carStatus")
    public static void  setCarUsage(TextView view ,boolean use)
    {
        if (use)
        {
            view.setText(R.string.usedCar);
        }else
        {
            view.setText(R.string.newCar);
        }


    }


    @BindingAdapter("showImage")
    public static void loadImage(ImageView image, String imgUrl)
    {
        Glide.with(image).load(imgUrl)
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_baseline_broken_image_24)
                .into(image);

    }
}
