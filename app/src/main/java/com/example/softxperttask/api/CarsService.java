package com.example.softxperttask.api;

import com.example.softxperttask.models.CarsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CarsService {

    @GET(value = "cars")
    public Call<CarsResponse> getCarList(@Query("page") int pageNumber);
}
