import java.util.Scanner;

public class highest_number_find {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a[] = new int[5];
		int k = 0;

		for (int i = 0; i < 5; i++) { // creates array
			System.out.println("Input numbers:");
			int j = scan.nextInt();
			a[i] = j;
		}

		for (int i = 0; i < 5; i++) { // finds highest
			int cur = a[i];
			int next;
			if (i + 1 <= 5)
				next = a[i];
			else
				next = a[i + 1];

			if (cur > next && cur > k)
				k = cur;
			else if (cur > next && cur <= k)
				k = k;
			else if (cur <= next && cur > k)
				k = next;
			else if (cur <= next && cur <= k)
				k = k;
		}

		System.out.println(k + " is the highest");

	}
}