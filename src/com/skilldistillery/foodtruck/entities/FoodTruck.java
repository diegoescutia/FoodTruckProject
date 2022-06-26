package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
//	unique numeric id, a name, food type, and numeric rating.
private int id;
private static int nextId=0;
private String name;
private String foodType;
private int rating;

public FoodTruck() {}

public FoodTruck(String name, String foodType, int rating) {
	
	this.name = name;
	this.foodType = foodType;
	this.rating = rating;
	this.nextId++;
	this.id= nextId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public String toString() {
	return "FoodTruck name: " + name + ", foodType: " + foodType + ", rating: " + rating + ", id: "+id+"]";
}





}

