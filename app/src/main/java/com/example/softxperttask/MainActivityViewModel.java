package com.example.softxperttask;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.softxperttask.api.CarsClient;
import com.example.softxperttask.api.CarsService;
import com.example.softxperttask.models.CarsResponse;
import com.example.softxperttask.models.DataItem;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends AndroidViewModel {
    public MainActivityViewModel(@NonNull @NotNull Application application) {
        super(application);
    }


  MutableLiveData<List<DataItem>> carsData = new MutableLiveData<List<DataItem>>();
    MutableLiveData<String> errorMsg = new MutableLiveData<String>();


    void getCarsList()
    {
        CarsService service = CarsClient.getInstance(this.getApplication()).create(CarsService.class);

        service.getCarList("1").enqueue(new Callback<CarsResponse>() {
            @Override
            public void onResponse(Call<CarsResponse> call, Response<CarsResponse> response) {

                try
                {
                    List<DataItem> list = response.body().getData();
                }catch (Exception e)
                {
                    assert response.body() != null;
                    int code = response.body().getStatus();
                    Log.e(null, "onResponse: " + code);
                    errorMsg.setValue(e.getLocalizedMessage());
                }



            }

            @Override
            public void onFailure(Call<CarsResponse> call, Throwable t) {

                errorMsg.setValue("Error retrieving List");


            }
        });
    }


}
