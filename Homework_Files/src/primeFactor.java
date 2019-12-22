public class primeFactor {

	public static void main(String[] args) {
		int num = 12;
		int i = 1;
		int newNum = num;

		while (i <= num) {
			if (num % i == 0) {
				newNum = newNum / i;
				if (newNum != 0 && newNum != 1 && newNum != num){
					System.out.println(newNum);
					System.out.println(i);
				}		
			}
			i++;
		}

	}
}