public class Gaseous extends Planet {
	private boolean storm;
	private int windSpeed;

	public Gaseous(int r, int m, String[] atm, boolean s, int wSpeed) {
		super(r, m, atm);

		storm = s;
		windSpeed = wSpeed;
	}

	public boolean getStorm() {
		return storm;
	}

	public void toggleStorm(int spd) {
		if (storm) {
			storm = false;
			windSpeed = 0;
		} else {
			storm = true;
			windSpeed = spd;
		}
	}

	public void toggleStorm() {
		storm = !storm;
	}

	public int getSpeed() {
		return windSpeed;
	}

	public void setSpeed(int spd) {
		if (storm) {
			windSpeed = spd;
		}
	}

	public String toString() {
		String total = super.toString();
		if (storm) {
			total += "storm: active";
			total += ("wind speed" + windSpeed);
		} else {
			total += "storm: inactive";
		}
		return total;
	}

}