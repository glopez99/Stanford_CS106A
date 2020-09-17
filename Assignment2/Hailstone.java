/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {

		//steps up the initial values and a step counter
		int value = readInt("Enter a number: ");
		int steps = 0;

		/* while value doesn't equal 1, it finds if it is even or odd
		 * if the value is even, it divides it by 2
		 * if the value is odd, it times it by 3 and adds one
		 * It then adds a step to the step counter and repeats
		 */
		while (value != 1) {
			int newValue;

			if (value % 2 == 0) {
				newValue = value / 2;
				println(value + " is even, so I  take half " + newValue);
			} else {
				newValue = 3 * value + 1;
				println(value + " is odd, so I make 3n + 1: " + newValue);
			}

			steps++;
			value = newValue;

		};

		println("The process took " + steps + " steps to reach 1.");
	};
}

