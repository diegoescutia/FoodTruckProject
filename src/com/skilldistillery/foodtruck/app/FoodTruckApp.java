package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
private FoodTruck[] fleetOfFoodTrucks= new FoodTruck[5];

public static void main(String[] args) {
	
	
	FoodTruckApp app = new FoodTruckApp();
	app.run();
	

}

public void run() {
	 // call the non-static methods in the FoodTruckApp class
	truckMaker();
	menu();
	
}

private void truckMaker() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to FoodTruck Rater. Please enter up to 5 Food trucks");
	for (int i =0; i<5; i++) {
	
	System.out.println("Enter the FoodTruck Name:");
	String name = scan.nextLine();
		if(name.equals("quit")) {
		break;
		}
	System.out.println("Enter the Food Type:");
	String foodType = scan.nextLine();
	System.out.println("Enter Rating: (1= projectile vomit, 5= i'll trade my left nut for this");
	int score = scan.nextInt();
	while(true) {
		if(score <= 5) {
			break;
		} else{
			System.out.println("Please enter a score between 1 - 5");
		}
		score= scan.nextInt();
		
	}	
	scan.nextLine();
	System.out.println();
	
	FoodTruck ft = new FoodTruck(name, foodType, score);
	fleetOfFoodTrucks[i] = ft;
	
	}
}
private void menu() {
	Scanner scan = new Scanner(System.in);
	while(true) {
	System.out.println();
	System.out.println("*****************************************************");
	System.out.println("   Enter the number of the action you want to take");
	System.out.println("   1. View list of all exisiting food trucks");
	System.out.println("   2. View the average rating for the food trucks");
	System.out.println("   3. View the food truck with the highest rating");
	System.out.println("   4. Quit");
	System.out.println("*****************************************************");
	
	int pick = scan.nextInt();
	scan.nextLine();
	
	if (pick == 1) {
		listOfTrucks();
		
	} 
		else if(pick == 2) {
		avgOfTrucks();
		
		} 
		else if(pick == 3) {
		topTruck();
		
		}
		else if(pick == 4) {
		quit();	
		scan.close();
		break;
		}
		else {
			System.out.println("Error! Please enter a valid number");
		}
	}
	System.out.println();
	
}

private void listOfTrucks() {
	for(int i=0; i<fleetOfFoodTrucks.length; i++) {
		if(fleetOfFoodTrucks[i]!= null) {
			System.out.println(fleetOfFoodTrucks[i].toString());
		}
	}
}
private void avgOfTrucks() {
	double sum = 0;
	double num = 1;
	double avg = 0;
	for(int i=0; i<fleetOfFoodTrucks.length; i++) {
		if(fleetOfFoodTrucks[i]!= null) {
			sum += fleetOfFoodTrucks[i].getRating();
			avg = sum/num;
			num++;
		}
	}
	System.out.println("The average rating of the food trucks is: " + avg);
	
 }
private void topTruck() {
	int topTruck = 0;
	int count = 0;
	String highestFT = "";
	
	for (int i = 0; i< fleetOfFoodTrucks.length; i++) {
		
		if(fleetOfFoodTrucks[i] == null) {
			break;
		}
		
		if (topTruck < fleetOfFoodTrucks[i].getRating()) {
			
			topTruck = fleetOfFoodTrucks[i].getRating();
			highestFT = fleetOfFoodTrucks[i].getName();
			count= i;
		}
	}
	System.out.println("The Food truck with the highest rating is: ");
	System.out.println(fleetOfFoodTrucks[count].toString());
}

private void quit() {
	System.out.println("Thank you for using FoodTruck Rater! Bye...");
}

}