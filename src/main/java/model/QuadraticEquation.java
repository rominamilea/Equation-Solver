package model;

/**
 * Represents an equation of second degree.
 * 
 * @author romina.milea
 * 
 */
public class QuadraticEquation extends Equation {

	/**
	 * The smaller root of the two roots.
	 */
	private Double x1;

	/**
	 * The biggest root of the two roots.
	 */
	private Double x2;

	/**
	 * Constructs a new QuadraticEquation object.
	 * 
	 * See also {@inheritDoc}
	 */
	public QuadraticEquation() {
		super(3);
	}

	/**
	 * Constructs a new QuadraticEquation object.
	 * 
	 * See also {@inheritDoc}
	 * 
	 */
	public QuadraticEquation(Double[] coefficients) {
		super(coefficients);
	}

	/**
	 * Returns a hash code value for the object.
	 * 
	 * @return a hash code value for this object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((x1 == null) ? 0 : x1.hashCode());
		result = prime * result + ((x2 == null) ? 0 : x2.hashCode());
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuadraticEquation other = (QuadraticEquation) obj;
		if (x1 == null) {
			if (other.x1 != null)
				return false;
		} else if (!x1.equals(other.x1))
			return false;
		if (x2 == null) {
			if (other.x2 != null)
				return false;
		} else if (!x2.equals(other.x2))
			return false;
		return true;
	}

	/**
	 * Returns custom string representation for this class.
	 * 
	 */
	public String toString() {
		return getCoefficients()[0].intValue() + "x^2 + "
			   + getCoefficients()[1].intValue() + "x + "
			   + getCoefficients()[2].intValue() + " = 0";
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
