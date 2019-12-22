/* Names: Rohan Pandey, Aditya Reddy
 *
 * Program file: DrawHouse
 *
 * Class description: Using the DrawingTool class to draw a house
 *
 **/

package RandomFunTester;

import apcslib.*;
import java.awt.Color;

public class DrawHouse {

	public void draw() {
		SketchPad pad = new SketchPad(300, 300);
		DrawingTool pencil = new DrawingTool(pad);

		Color darkBrown = new Color(71, 32, 0);
		Color brown = new Color(139, 69, 19);
		Color darkGreen = new Color(0, 128, 0);
		Color darkRed = new Color(178, 6, 0);
		Color sunYellow = new Color(253, 184, 19);

		double angle1 = -45;
		double angle2 = -90;
		double len1 = 150;
		double len2 = 70.71 * 3;
		double lenDoor1 = len2 / 2 - len2 / 12;
		double lenDoor2 = len1 / 3;
		double lenDoor3 = len2 / 6;
		double windowSide = 47.426; // distance between wall and window
		double betWindow = 117.278;
		double radius = 25;
		double windowHeight = 90;

		pencil.setColor(darkBrown);
		pencil.setWidth(4);
		pencil.up();
		pencil.move(-100, -100);
		pencil.turnLeft(angle2 - 45);
		pencil.down();
		pencil.forward(len1); // left wall
		pencil.turnLeft(angle1);
		pencil.setWidth(20);
		pencil.forward(len1); // top left roof
		pencil.turnLeft(angle2);
		pencil.forward(len1); // top right roof
		pencil.turnLeft(angle1);
		pencil.setWidth(4);
		pencil.forward(len1); // right wall
		pencil.turnLeft(angle2);
		pencil.forward(len2); // floor
		pencil.turnLeft(angle2);

		pencil.forward(len1); // left wall again
		pencil.turnLeft(angle2);
		pencil.forward(len2); // ceiling
		pencil.turnLeft(angle2);
		pencil.forward(len1); // right wall
		pencil.turnLeft(angle2);
		pencil.forward(lenDoor1); // right floor before door
		pencil.turnLeft(angle2);
		pencil.forward(4);
		pencil.setColor(Color.blue);
		pencil.forward(lenDoor2); // right door
		pencil.turnLeft(90);
		pencil.forward(lenDoor3); // left door
		pencil.turnLeft(90);
		pencil.forward(lenDoor2 + 4);
		pencil.turnLeft(angle2);
		pencil.setColor(darkBrown);
		pencil.forward(lenDoor1);

		pencil.up();
		pencil.turnRight(90);
		pencil.forward(windowHeight);
		pencil.turnRight(90);
		pencil.forward(windowSide);

		pencil.down();
		pencil.setWidth(3);
		pencil.setColor(Color.black);// draws window
		pencil.drawCircle(radius);
		pencil.setColor(Color.cyan);
		pencil.fillOval(radius * 2, radius * 2);
		pencil.setColor(Color.black);
		pencil.forward(radius);
		pencil.turnLeft(180);
		pencil.forward(radius * 2);
		pencil.turnLeft(180);
		pencil.forward(radius);
		pencil.turnLeft(90);
		pencil.forward(radius);
		pencil.turnLeft(180);
		pencil.forward(radius * 2);
		pencil.turnLeft(180);
		pencil.forward(radius);
		pencil.turnRight(90);
		pencil.up();

		pencil.forward(betWindow);

		pencil.down();
		pencil.setWidth(4);
		pencil.setColor(Color.black);// draws window
		pencil.drawCircle(radius);
		pencil.setColor(Color.cyan);
		pencil.fillOval(radius * 2, radius * 2);
		pencil.setColor(Color.black);
		pencil.forward(radius);
		pencil.turnLeft(180);
		pencil.forward(radius * 2);
		pencil.turnLeft(180);
		pencil.forward(radius);
		pencil.turnLeft(90);
		pencil.forward(radius);
		pencil.turnLeft(180);
		pencil.forward(radius * 2);
		pencil.turnLeft(180);
		pencil.forward(radius);
		pencil.turnRight(90);
		pencil.up();

		pencil.forward(windowSide);
		pencil.turnRight(90);
		pencil.forward(windowHeight);
		pencil.turnLeft(90);
		pencil.forward(55);
		pencil.turnRight(180);
		pencil.forward(30);
		pencil.down();
		pencil.setColor(brown); // draw tree
		pencil.fillRect(40, 150);
		pencil.turnRight(90);
		pencil.forward(75);
		pencil.setColor(Color.green); // draw leaves
		pencil.drawCircle(75);
		pencil.setColor(darkGreen);
		pencil.fillOval(150, 150);
		pencil.setColor(darkRed);
		pencil.up();
		pencil.forward(20);
		pencil.turnLeft(90);
		pencil.forward(25);
		pencil.down();
		pencil.fillOval(20, 20); // apple 1
		pencil.up();
		pencil.turnLeft(90);
		pencil.forward(60);
		pencil.turnRight(90);
		pencil.forward(10);
		pencil.down();
		pencil.fillOval(20, 20); // apple 2
		pencil.up();
		pencil.turnLeft(180);
		pencil.forward(50);
		pencil.turnLeft(90);
		pencil.forward(30);
		pencil.down();
		pencil.fillOval(20, 20); // apple 3
		pencil.up();
		pencil.forward(45);
		pencil.turnRight(90);
		pencil.forward(20);
		pencil.down();
		pencil.fillOval(20, 20); // apple 4
		pencil.up();
		pencil.turnRight(90);
		pencil.forward(80);
		pencil.turnLeft(90);
		pencil.forward(10);
		pencil.down();
		pencil.fillOval(20, 20); // apple 5
		pencil.up();

		pencil.turnLeft(90);
		pencil.forward(210);
		pencil.turnLeft(90);
		pencil.forward(350);
		pencil.setColor(sunYellow);
		pencil.down();
		pencil.fillOval(70, 70); // sun
		pencil.up();

	}
}