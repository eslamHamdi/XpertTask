package com.example.softxperttask.api;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class CarsClient {

    private static final String BASE_URL = "http://demo1585915.mockable.io/";

      //static Moshi moshi = new Moshi.Builder().add(KotlinJsonAdapterFactory()).build();




    public static Retrofit getInstance()
    {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
    }
}
