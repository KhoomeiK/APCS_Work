public class multiplesOf3and5 {

	public static void main(String[] args) {
		int result = 0;
		for(int i = 1; i < 1000; i++){
			if (i%3 == 0 || i%5 == 0) {
				result = result + i;
			}
			else {
				result = result + 0;
			}
		}
		
		System.out.println(result);
	}

}