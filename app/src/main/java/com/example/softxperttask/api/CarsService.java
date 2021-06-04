package com.example.softxperttask.api;

import com.example.softxperttask.models.CarsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarsService {

    @GET("cars?page={page}")
    public Call<CarsResponse> getCarList(@Path("page") String page);
}
