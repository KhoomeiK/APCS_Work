public class Terrestrial extends Planet {
	private int population; // population of planet
	private int temp; // temperature of planet (Celsius)

	public Terrestrial(int r, int m, String[] atm, int t, int p) {
		super(r, m, atm);

		population = p;
		temp = t;
	}

	public void setTemp(int t) {
		temp = t;
	}

	public void setPopulation(int p) {
		population = p;
	}

	public int getTemp() {
		return temp;
	}

	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return (super.toString() + " temperature = " + temp + ", population = " + population);
	}

}