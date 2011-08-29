package model;

import java.util.Arrays;

/**
 * Represents an equation.
 * 
 * @author romina.milea
 */
public abstract class Equation {

	private Double[] coefficients;

	/**
	 * Constructs a new Equation object with the number of coefficients
	 * specified by the taken initial capacity.
	 * 
	 * @param initialCapacity
	 *            the number of coefficients for this equation
	 */
	public Equation(int initialCapacity) {
		coefficients = new Double[initialCapacity];
	}

	/**
	 * Constructs an Equation object whose coefficients contain the elements of
	 * the specified array.
	 * 
	 * @param coefficients
	 *            the array whose elements are to be placed into the array of
	 *            coefficients
	 */
	public Equation(Double[] coefficients) {
		this.coefficients = new Double[coefficients.length];
		
		for (int i = 0; i < coefficients.length; i++) {
			this.coefficients[i] = coefficients[i];
		}
	}

	/**
	 * Returns a hash code value for the object.
	 * 
	 * @return a hash code value for this object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(coefficients);
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equation other = (Equation) obj;
		if (!Arrays.equals(coefficients, other.coefficients))
			return false;
		return true;
	}

	/**
	 * Returns the coefficients of this equation.
	 * 
	 * @return the coefficients of this equation
	 */
	public Double[] getCoefficients() {
		return coefficients;
	}

	/**
	 * Sets the coefficients of this equation with the specified array of
	 * coefficients.
	 * 
	 * @param coefficients
	 *            the array of coefficients
	 */
	public void setCoefficients(Double[] coefficients) {
		this.coefficients = coefficients;
	}

}
