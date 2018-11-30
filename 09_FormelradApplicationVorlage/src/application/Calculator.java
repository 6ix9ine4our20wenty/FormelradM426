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
    //Feature 9
    public String toString() {
        return "Calculator [leistung=" + current +
                ", spannung=" + tension +
                ", strom=" + power +
                ", widerstand=" + resistance + "]";
    }

	public void calculate() {
		while (resistance == 0 || current == 0 || tension == 0 || power == 0) {
			if (resistance == 0) {
				calculateRessistence(tension, current, power);
			} else if (current == 0) {
				calculateCurrent(tension, power, resistance);
			} else if (tension == 0) {
				calculateTension(power, current, resistance);
			} else if (power == 0) {
				calculatePower(tension, current, resistance);
			}
		}
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
	private void calculateCurrent(double tension, double power, double ressistence) {
		if (power == 0) {
			current = tension * ressistence;
		} else if (ressistence == 0) {
			current = power / tension;
		} else {
			current = Math.sqrt(power * ressistence);
		}
	}
	private void calculateRessistence(double tension, double power, double current) {
		if (current == 0) {
			resistance = (tension * tension) / power;
		} else if (tension == 0) {
			resistance = power / (current * current);
		} else {
			resistance = current / tension;
		}

	}
}
