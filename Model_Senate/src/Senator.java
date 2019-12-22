import java.util.Scanner;

public class Senator {
	public String name;
	public Bill billList[] = new Bill[10];

	public void listBillName(Senator s) {
		for (int i = 0; i < 10; i++)
			System.out.println(i + ": " + (billList[i]).name);
	}

	public String getBillName(Senator s, int billNum) {
		return (billList[billNum]).name;
	}

	public String getBillText(Senator s, int billNum) {
		return (billList[billNum]).text;
	}
	// hi
	public void newAmend(Bill bill, String amendName) {
		Bill amendment = new Bill(amendName, bill.text);
	}

	public void write(Bill bill) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bill text: ");
		bill.text = scan.nextLine();
	}
	
	public String propose(Senator s, Bill bill) {
		
		return "hi";
	}
}
