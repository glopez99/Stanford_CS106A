/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		addTarget(getWidth() / 2, getHeight() / 2);
	};

	private void addTarget (double cx, double cy) {
		addOuterCircle(cx, cy);
		addMiddleCircle(cx, cy);
		addInnerCircle(cx, cy);
	};

	private void addOuterCircle (double cx, double cy) {
		double radius = 72;
		double x = cx - radius;
		double y = cy - radius;

		GOval outerCircle = new GOval(x, y, radius * 2, radius *2);
		outerCircle.setFilled(true);
		outerCircle.setFillColor(Color.red);
		add(outerCircle);
	};

	private void addMiddleCircle (double cx, double cy) {
		double radius = 72 * .65;
		double x = cx - radius;
		double y = cy - radius;

		GOval middleCircle = new GOval(x, y, radius * 2, radius *2);
		middleCircle.setFilled(true);
		middleCircle.setFillColor(Color.white);
		add(middleCircle);
	};

	private void addInnerCircle (double cx, double cy) {
		double radius = 72 * .3;
		double x = cx - radius;
		double y = cy - radius;

		GOval innerCircle = new GOval(x, y, radius * 2, radius *2);
		innerCircle.setFilled(true);
		innerCircle.setFillColor(Color.red);
		add(innerCircle);
	};
}
