public class StellarTester {

	public static void main(String[] args) {
		String[] atmosphere = { "Helium", "Granite", "Netflix" };
		Planet earth = new Terrestrial(3959, 30281, atmosphere, 3922, 43111);
		System.out.println(earth);
		
		atmosphere[2] = "Hulu";
		Planet jupiter = new Gaseous(11052, 21337, atmosphere, true, 3200);
		System.out.println(((Gaseous) jupiter).getStorm());
		((Gaseous) jupiter).toggleStorm();
		System.out.println(((Gaseous) jupiter).getStorm());
	}
}