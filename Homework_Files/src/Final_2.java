/* Rohan Pandey
 * 7/19/17
 * Sum of Digits
 */
public class Final_2 {

	public static void main(String[] args) {
		int[] data = {31, 23, 51, 71, 99, 12, 90, 24, 54};
		
		int[] tenData = new int [9];
		int[] oneData = new int [9];
		int[] toData = new int [9];
		
		for (int i = 0; i < 9; i++)  {
			tenData[i] = data[i] / 10;
			oneData[i] = data[i] % 10;
			toData[i] = tenData[i] + oneData[i];
		}
		
		for (int j= 0; j < 9; j++) {
			System.out.println(toData[j]);
		}
		
	}
}