package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		String ftName = null;
		String ftFoodType = null;
		int ftRating = 0;
		FoodTruck[] foodTrucks = new FoodTruck[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < foodTrucks.length; i++) {

			System.out.println("Please input the name of the food truck: (Input quit to exit)");
			ftName = sc.next();

			if (ftName.equals("quit")) {
				break;
			}
			System.out.println("Please input the food type: ");
			ftFoodType = sc.next();

			System.out.println("Please input the rating of the food truck: (1-5 with 5 being best)");
			ftRating = sc.nextInt();

			FoodTruck newFoodTruck = new FoodTruck(ftName, ftFoodType, ftRating);

			foodTrucks[i] = newFoodTruck;

		}
		boolean enterLoop = true;
		while (enterLoop) {

			int choice = 0;
			System.out.println("Enter 1 to List All Existing Food Trucks");
			System.out.println("Enter 2 to See the Average Rating of Food Trucks");
			System.out.println("Enter 3 to Display the Highest-Rated Food Truck");
			System.out.println("Enter 4 to Quit");
			choice = sc.nextInt();
			if (choice < 5) {

				switch (choice) {
				case 1:
					for (int j = 0; j < foodTrucks.length; j++) {
						if (foodTrucks[j] == null) {
							break;
						}
						if (foodTrucks[j] != null) {
							System.out.println(foodTrucks[j]);
						}
					}
					break;
				case 2:
					int sumRatings = 0;
					int aveRatings = 0;
					int count = 0;

					for (int j = 0; j < foodTrucks.length; j++) {
						if (foodTrucks[j] == null) {
							break;
						}
						sumRatings += foodTrucks[j].getFtRating();
						count++;
					}
					aveRatings = sumRatings / count;
					System.out.println("Average Rating is: " + aveRatings);
					break;

				case 3:
					int max = foodTrucks[0].getFtRating();
					int counter = 0;

					for (int j = 0; j < foodTrucks.length; j++) {
						if (foodTrucks[j] == null) {
							break;
						}

						if (max < foodTrucks[j].getFtRating()) {
							max = foodTrucks[j].getFtRating();
							counter = j;
						}
					}

					System.out.println(
							"The highest rated truck is " + foodTrucks[counter].toString());
					break;

				case 4:
					System.out.println("Goodbye!");
					enterLoop = false;
					break;

				default:
					System.out.println("Invalid input -- please try again.");
					break;
				}
			}

		}
		sc.close();
	}
}
