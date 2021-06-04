package com.example.softxperttask.api;

import android.content.Context;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class CarsClient {

    private static final String BASE_URL = "http://demo1585915.mockable.io/api/v1/";

      static Moshi moshi = new Moshi.Builder().add(JsonAdapter.Factory.class).build();




    public static Retrofit getInstance(Context context)
    {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();
    }
}
