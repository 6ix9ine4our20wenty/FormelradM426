package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double current;
	private double tension;
	private double power;
	private double resistance;
	
	public Calculator(double current, double tension, double power, double resistance) {
		super();
		this.current = current;
		this.tension = tension;
		this.power = power;
		this.resistance = resistance;
	}
	
	public double getLeistung() {
		return current;
	}
	
	public double getSpannung() {
		return tension;
	}

	public double getStrom() {
		return power;
	}

	public double getWiderstand() {
		return resistance;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + current +
				", spannung=" + tension +
				", strom=" + power +
				", widerstand="	+ resistance + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	private void calculatePower(double tension, double current, double ressistence) {
		if (ressistence == 0) {
			power = tension * current;
		} else if (tension == 0) {
			power = ressistence * (current * current);
		} else {
			power = (tension * tension) / ressistence;
		}
	}
	private void calculateTension(double current, double power, double ressistence) {
		if (ressistence == 0) {
			tension = power / current;
		} else if (power == 0) {
			tension = ressistence / current;
		} else {
			tension = Math.sqrt(power / ressistence);
		}
	}
	
}
