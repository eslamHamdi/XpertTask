package com.example.softxperttask.models;

import com.squareup.moshi.Json;

import java.util.List;


public class CarsResponse{

	@Json(name = "data")
	private List<DataItem> data;

	@Json(name = "status")
	private int status;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}
}