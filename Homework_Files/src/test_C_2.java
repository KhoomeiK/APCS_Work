import java.util.Scanner;

public class test_C_2 {

	public static void main(String[] args) {
		Scanner strScan = new Scanner(System.in);
		System.out.println("Enter word one:");
		String str1 = strScan.nextLine();
		System.out.println("Enter word two:");
		String str2 = strScan.nextLine();
		
		int len = (str1 + str2).length();
		int num = 30 - len;
		
		System.out.print(str1);
		
		int per = 0;
		while(per < num){
			System.out.print(".");
			per++;
		}
		System.out.print(str2);
	}
}