package model;

/**
 * Represents an equation of second degree.
 * 
 * @author romina.milea
 * 
 */
public class QuadraticEquation {

	/**
	 * Coefficient of x^2.
	 */
	private Double a;

	/**
	 * Coefficient of x.
	 */
	private Double b;

	/**
	 * The constant term.
	 */
	private Double c;

	/**
	 * The smaller root of the two roots.
	 */
	private Double x1;

	/**
	 * The biggest root of the two roots.
	 */
	private Double x2;

	/**
	 * Constructs a new QuadraticEquation object having all coefficients set to
	 * zero.
	 */
	public QuadraticEquation() {
		a = new Double(0);
		b = new Double(0);
		c = new Double(0);
	}

	/**
	 * Construct a new QuadraticEquation object having the passed coefficients.
	 * 
	 * @param a
	 *            Coefficient of x^2.
	 * @param b
	 *            Coefficient of x.
	 * @param c
	 *            The constant term.
	 */
	public QuadraticEquation(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Returns a hash code value for the object.
	 * 
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}

	/**
	 * Indicates whether some other object is "equal to" this one
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * 
	 * @return true if this object is the same as the obj argument; false
	 *         otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuadraticEquation other = (QuadraticEquation) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	/**
	 * Returns custom string representation for this class.
	 */
	public String toString() {
		return a + "x^2 + " + b + "x + " + c + " = 0";
	}

	/**
	 * Sets the coefficient value for x^2 with a specific double value.
	 * 
	 * @param a
	 *            the double value to be set the coefficient of x^2
	 */
	public void setA(Double a) {
		this.a = a;
	}

	/**
	 * Returns the coefficient of x^2.
	 * 
	 * @return the coefficient of x^2
	 */
	public Double getA() {
		return a;
	}

	/**
	 * Sets the coefficient value for x with a specific double value.
	 * 
	 * @param b
	 *            the double value to be set the coefficient of x
	 */
	public void setB(Double b) {
		this.b = b;
	}

	/**
	 * Returns the coefficient of x.
	 * 
	 * @return the coefficient of x
	 */
	public Double getB() {
		return b;
	}

	/**
	 * Sets the constant term value with a specific double value.
	 * 
	 * @param c
	 *            the double value to be set the constant term
	 */
	public void setC(Double c) {
		this.c = c;
	}

	/**
	 * Returns the constant term value.
	 * 
	 * @return the constant term value
	 */
	public Double getC() {
		return c;
	}

	/**
	 * Sets the smaller root of this class with a double value.
	 * 
	 * @param x1
	 *            the double value to be set the smaller root
	 */
	public void setX1(Double x1) {
		this.x1 = x1;
	}

	/**
	 * Returns the smaller root of this quadratic equation.
	 * 
	 * @return the smaller root of this quadratic equation
	 */
	public Double getX1() {
		return x1;
	}

	/**
	 * Sets the biggest root of this class with a double value.
	 * 
	 * @param x2
	 *            the double value to be set the biggest root
	 */
	public void setX2(Double x2) {
		this.x2 = x2;
	}

	/**
	 * Returns the biggest root of this quadratic equation.
	 * 
	 * @return the biggest root of this quadratic equation
	 */
	public Double getX2() {
		return x2;
	}

}
