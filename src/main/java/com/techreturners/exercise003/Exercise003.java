package com.techreturners.exercise003;

public class Exercise003 {

	// Scenario
	// Several people are standing in a row divided into two teams. The first person
	// goes into team 1, the second goes into team 2, the third goes into team 1,
	// and so on.

	// Task
	// Given an array of positive integers (the weights of the people), return a new
	// array/tuple of two integers, where the first one is the total weight of
	// team 1, and the second one is the total weight of team 2.

	// Notes
	// Array size is at least 1.
	// All numbers will be positive.
	// Input >> Output Examples
	// rowWeights([13, 27, 49]) ==> return (62, 27)
	// Explanation:
	// The first element 62 is the total weight of team 1, and the second element 27
	// is the total weight of team 2.

	// rowWeights([50, 60, 70, 80]) ==> return (120, 140)
	// Explanation:
	// The first element 120 is the total weight of team 1, and the second element
	// 140 is the total weight of team 2.

	// rowWeights([80]) ==> return (80, 0)
	// Explanation:
	// The first element 80 is the total weight of team 1, and the second element 0
	// is the total weight of team 2.

	public static int[] rowWeights(final int[] weights) {
		// Your code here!
		int[] newArray = new int[2];

		int counter = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < weights.length; i++) {
			counter = counter + 1;
			if (counter % 2 == 0) {
				sum1 = sum1 + weights[i];
			} else {
				sum2 = sum2 + weights[i];
			}
		}
		newArray[0] = sum2;
		newArray[1] = sum1;
		return newArray;
	}

}