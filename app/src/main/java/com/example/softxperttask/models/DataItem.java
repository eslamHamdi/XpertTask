package com.example.softxperttask.models;

import com.squareup.moshi.Json;

public class DataItem{

	@Json(name = "imageUrl")
	private String imageUrl;

//	@Json(name = "id")
//	private int id;

	@Json(name = "constractionYear")
	private String constractionYear;

	@Json(name = "brand")
	private String brand;

	@Json(name = "isUsed")
	private boolean isUsed;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

//	public void setId(int id){
//		this.id = id;
//	}
//
//	public int getId(){
//		return id;
//	}

	public void setConstractionYear(String constractionYear){
		this.constractionYear = constractionYear;
	}

	public String getConstractionYear(){
		return constractionYear;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setIsUsed(boolean isUsed){
		this.isUsed = isUsed;
	}

	public boolean isIsUsed(){
		return isUsed;
	}
}