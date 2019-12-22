/* Names: Rohan Pandey
 *
 * Program file: RandomFunTester
 *
 * Class description: Randomly chooses to draw a house,  square, or circles
 *
 **/

package RandomFunTester;

import java.util.Random;

public class RandomFunTester {

	public static void main(String[] args) {
		Random r = new Random();
		int rand = r.nextInt(3) + 1;

		switch (rand) {
		case 1:
			DrawHouse house = new DrawHouse();
			house.draw();
			break;
		case 2:
			DrawSquare square = new DrawSquare();
			square.draw();
			break;
		case 3:
			Random rCirc = new Random();
			int randCirc = rCirc.nextInt(31) + 20;
			DrawCircles circles = new DrawCircles();
			circles.draw(randCirc);
			break;
		default:
			System.out.println("error");
		}

	}

}