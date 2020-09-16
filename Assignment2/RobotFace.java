import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {

    //set the dimensions of the head
    private static final int HEAD_WIDTH = 150;
    private static final int HEAD_HEIGHT = 200;
    private static final int EYE_RADIUS = 15;
    private static final int MOUTH_WIDTH = 75;
    private static final int MOUTH_HEIGHT = 20;

    // adds the face by running the addFace method after finding
    // center point
    public void run () {
        addFace(getWidth() / 2, getHeight() / 2);
    };

    // adds in Head, Eyes, and Mouth
    private void addFace (double centeredX, double centeredY) {
        addHead(centeredX, centeredY);
        addEyes(centeredX, centeredY);
        addMouth(centeredX, centeredY);
    }

    // adds in the Head
    private void addHead(double centeredX, double centeredY){
        double x = centeredX - HEAD_WIDTH/2;
        double y = centeredY - HEAD_HEIGHT/2;
        GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
        head.setFilled(true);
        head.setFillColor(Color.gray);
        add(head);
    }

    // adds in the eyes
    private void addEyes(double centeredX, double centeredY) {
        double leftEyeX = centeredX - (HEAD_WIDTH / 4) - EYE_RADIUS;
        double rightEyeX = centeredX + (HEAD_WIDTH / 4) - EYE_RADIUS;
        double eyeHeight = centeredY - (HEAD_HEIGHT / 4);

        GOval leftEye = new GOval(leftEyeX, eyeHeight, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.yellow);

        GOval rightEye = new GOval(rightEyeX, eyeHeight, 2 * EYE_RADIUS,2 * EYE_RADIUS);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.yellow);

        add(leftEye);
        add(rightEye);

    }

    // adds in the mouth
    private void addMouth(double centeredX, double centeredY) {
        double mouthHeight = centeredY + (HEAD_HEIGHT / 4) - (MOUTH_HEIGHT / 2);
        double x = centeredX - (MOUTH_WIDTH / 2);

        GRect mouth = new GRect(x, mouthHeight, MOUTH_WIDTH, MOUTH_HEIGHT);
        mouth.setFilled(true);
        mouth.setFillColor(Color.white);
        add(mouth);
    }
};