package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String ftName = "";
	private String ftFoodType = "";
	private int ftRating = 0;
	private int ftId;
	private static int nextId = 0;

	public FoodTruck() {
	}

	public FoodTruck(String ftName, String ftFoodType, int ftRating) {
		this.ftName = ftName;
		this.ftFoodType = ftFoodType;
		this.ftRating = ftRating;
		this.ftId = nextId;
		nextId++;
	}

	public String getFtName() {
		return ftName;
	}

	public void setFtName(String ftName) {
		this.ftName = ftName;
	}

	public String getFtFoodType() {
		return ftFoodType;
	}

	public void setFtFoodType(String ftFoodType) {
		this.ftFoodType = ftFoodType;
	}

	public int getFtRating() {
		return ftRating;
	}

	public void setFtRating(int ftRating) {
		this.ftRating = ftRating;
	}

	// menu , menu options, toString to work, read the user stories

	public String toString() {
		String output = "Food Truck Name is " + ftName + ", Food Type is " + ftFoodType + ", Food Truck Rating is "
				+ ftRating + ", Truck ID is " + ftId;

		return output;
	}

	public void displayFoodTruck() {
		String ftData = toString();
		System.out.println(ftData);
	}

}
