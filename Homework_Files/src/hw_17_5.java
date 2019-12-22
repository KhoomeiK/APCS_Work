import java.util.Scanner;

public class hw_17_5 {
	public static void main(String[] args) {
		String space = new String("       ");
		int countSpace = 7;
		
		String star = new String("***************");
		int countStar = 1;
		
		while (countStar <= 15){
			System.out.print(space.substring(0, countSpace));
			System.out.print(star.substring(0, countStar));
			System.out.println("");
			countStar = countStar + 2;
			countSpace--;
		}
		int i = 0;
		while (i < 3){
			System.out.print("      ");
			System.out.print(star.substring(0,3));
			System.out.println("");
			i++;
		}
	}
}
