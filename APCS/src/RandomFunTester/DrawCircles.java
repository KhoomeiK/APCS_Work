/* Names: Rohan Pandey
 *
 * Program file: DrawCircles
 *
 * Class description: Draws 3 circles of 
 * different colors with radii based on 
 * a parameter in the constructor
 *
 **/

package RandomFunTester;

import apcslib.*;
import java.awt.Color;

public class DrawCircles {
	private SketchPad pad;
	private int myRadius;
	private DrawingTool pen;

	public void draw(int x) {
		myRadius = x;
		pad = new SketchPad(300, 300);
		pen = new DrawingTool(pad);

		Color yellow = Color.yellow;
		Color green = Color.green;
		Color blue = Color.blue;

		pen.setColor(yellow);
		pen.drawCircle(myRadius);
		pen.up();
		pen.move(-75, -75);
		pen.setColor(green);
		pen.down();
		pen.drawCircle(myRadius);
		pen.up();
		pen.move(100, 50);
		pen.setColor(blue);
		pen.down();
		pen.drawCircle(myRadius);

	}

}
