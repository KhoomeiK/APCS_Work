import java.util.Scanner;

public class Final_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find: ");
		int num = scan.nextInt();

		int list[] = { 0, 2, 3, 5, 8, 11, 13, 16, 21 };
		int orig = (list.length / 2);

		int newNum = list[orig];
		
		while (newNum != num) {
			if (num < newNum) {
				orig /= 2;
				newNum = list[orig];
				
				if (num != newNum){
					System.out.println("not found");
					break;
				}
			}

			else if (num > newNum) {
				orig *= 2;
				newNum = list[orig];
				
				if (num != newNum){
					System.out.println("not found");
					break;
				}
			}
			
		}

		System.out.println(num + " is number " + orig + " in the series");

	}

}
