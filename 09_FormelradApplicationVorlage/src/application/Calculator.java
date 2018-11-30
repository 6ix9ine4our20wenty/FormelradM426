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
	
	/* Hier die Methoden mit den Formlen hinzuf�gen
	 */
	
}
