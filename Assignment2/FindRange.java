/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println("This program finds the largest and smallest numbers.");

		//sets up the terms for the sentinel, largest, & smallest values
		int SENTINEL = 0;
		int value  = readInt("?");
		int smallestValue = value;
		int largestValue = value;

		//checks if sentinel was entered as the first number
		if(value == SENTINEL) {
			println("No valid values have been entered.");
			return;

		};

		//continues to have the user enter numbers as long as the sentinel
		//value hasn't been entered. This also keeps track of the largest
		//and lowest values.
		while (value != SENTINEL) {

			if (value >= largestValue) {
				largestValue = value;
			} else if (value <= smallestValue) {
				smallestValue = value;
			}

			value = readInt("?");
		};

		//returns the output for the largest and smallest number
		println("Smallest value: " + smallestValue);
		println("Largest value: " + largestValue);

	};
}

