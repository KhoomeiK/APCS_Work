import java.util.Scanner;

public class fair_photography {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input:");

		String input = "x";
		String a[] = new String[1000000];
		int len = 0;
		
		for (int i = 0; i < 1000000; i++) {
			if (!input.equals("")) {
				input = scan.nextLine();
				if (!input.equals("")) 
					a[i] = input;
					len++;
			}
		}
		len--;
		int b[][] = new int[len][2];

		for (int i = 0; i < len; i++) {
			String temp = a[i];
			int index = temp.indexOf(" ");
			//System.out.println(index);
			String numA = temp.substring(0, index);
			String numB = temp.substring(index + 1);
			int num1 = Integer.parseInt(numA); // position
			int num2 = Integer.parseInt(numB); // breed
			b[i][0] = num1;
			b[i][1] = num2;
		}
		int minPos = 1000000;
		int maxPos = 0;
		for (int i = 0; i < len; i++) {
			if (b[i][0] < minPos)
				minPos = b[i][0];
				System.out.println(minPos);
			if (b[i][0] > maxPos)
				maxPos = b[i][0];
				System.out.println(maxPos);
		}

		int c[][] = new int[len][2];
		// order by position
		// find proportions of breeds
		// find longest lengths with equal breeds
	}
}
