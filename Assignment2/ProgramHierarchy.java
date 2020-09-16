/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {

	private static final double BOX_WIDTH = 120;
	private static final double BOX_HEIGHT = 40;
	private static final double SPACE_BETWEEN_BOXES = 10;

	public void run() {
		/* You fill this in. */
		addDiagram (getWidth() / 2, getHeight() / 2);
	};

	private void addDiagram (double cx, double cy) {
		addProgramBox(cx, cy);
		addGraphicsProgramBox(cx, cy);
		addConsoleProgramBox(cx, cy);
		addDialogProgramBox(cx, cy);
		addLines(cx, cy);
	};

	private void addProgramBox (double cx, double cy) {
		double x = cx - BOX_WIDTH / 2;
		double y = cy - BOX_HEIGHT;

		GRect programBox = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(programBox);


		GLabel programLabel = new GLabel("Program");
		double labelX = cx - programLabel.getWidth() / 2;
		double labelY = y + programLabel.getAscent() * 2;
		add(programLabel, labelX, labelY);
	};

	private void addGraphicsProgramBox (double cx, double cy) {
		double x = cx - (BOX_WIDTH / 2) - (BOX_WIDTH + SPACE_BETWEEN_BOXES);
		double y = cy + BOX_HEIGHT;

		GRect graphicsBox = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(graphicsBox);


		GLabel graphicsLabel = new GLabel("Graphics Program");
		double labelX = x + (BOX_WIDTH - graphicsLabel.getWidth()) / 2;
		double labelY = y + graphicsLabel.getAscent() * 2;
		add(graphicsLabel, labelX, labelY);

	};

	private void addConsoleProgramBox (double cx, double cy) {
		double x = cx - (BOX_WIDTH / 2);
		double y = cy + BOX_HEIGHT;

		GRect consoleBox = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(consoleBox);


		GLabel consoleLabel = new GLabel("Console Program");
		double labelX = cx - consoleLabel.getWidth() / 2;
		double labelY = y + consoleLabel.getAscent() * 2;
		add(consoleLabel, labelX, labelY);

	};

	private void addDialogProgramBox (double cx, double cy) {
		double x = cx + SPACE_BETWEEN_BOXES + (BOX_WIDTH / 2);
		double y = cy + BOX_HEIGHT;

		GRect dialogBox = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(dialogBox);


		GLabel dialogLabel = new GLabel("Dialog Program");
		double labelX = x + (BOX_WIDTH - dialogLabel.getWidth()) / 2;
		double labelY = y + dialogLabel.getAscent() * 2;
		add(dialogLabel, labelX, labelY);

	};

	private void addLines (double cx, double cy) {
		double programBottomY = cy;
		double secondRowY = cy + BOX_HEIGHT;
		double gpCenterX = cx - BOX_WIDTH + SPACE_BETWEEN_BOXES;
		double dpCenterX = cx + BOX_WIDTH + SPACE_BETWEEN_BOXES;

		GLine progToGP = new GLine(cx, programBottomY, gpCenterX, secondRowY);
		add(progToGP);

		GLine progToCP = new GLine(cx, programBottomY, cx, secondRowY);
		add(progToCP);

		GLine progToDP = new GLine(cx, programBottomY, dpCenterX, secondRowY);
		add(progToDP);

	};
}

