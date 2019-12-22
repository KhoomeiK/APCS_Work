
public class evenFibbonaci {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k = 0;
		int result = 0;
		while (k <= 4000000) {
			k = i + j;
			i = j;
			j = k;
			if (k%2 == 0) {
				result = result + k;
				System.out.println(result);
			}
			
		}

	}

}
