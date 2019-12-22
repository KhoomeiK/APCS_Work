public abstract class Planet implements StellarObject {
	protected int radius;
	protected int mass;

	String[] atmosphere = new String[3];

	public Planet(int r, int m, String[] atm) {
		radius = r;
		mass = m;
		atmosphere = atm;
	}

	public void Planet() {
		radius = 0;
		mass = 0;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setMass(int m) {
		mass = m;
	}

	public int getMass() {
		return mass;
	}

	public void setAtmosphere(String[] atm) {
		atmosphere = atm;
	}

	public String[] getAtmosphere() {
		return atmosphere;
	}

	public String toString() {
		return ("radius = " + radius + ", mass = " + mass + ", and atmospheric gases = " + atmosphere[0] + " "
				+ atmosphere[1] + " " + atmosphere[2]);
	}
}
