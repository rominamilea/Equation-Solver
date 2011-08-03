package model;

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
	 * Construct an equation having all coefficients set to zero.
	 * 
	 */
	public QuadraticEquation() {
		a = new Double(0);
		b = new Double(0);
		c = new Double(0);
	}

	/**
	 * Construct an equation having the passed coefficients.
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

	public void setA(Double a) {
		this.a = a;
	}

	public Double getA() {
		return a;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getB() {
		return b;
	}

	public void setC(Double c) {
		this.c = c;
	}

	public Double getC() {
		return c;
	}

	public void setX1(Double x1) {
		this.x1 = x1;
	}

	public Double getX1() {
		return x1;
	}

	public void setX2(Double x2) {
		this.x2 = x2;
	}

	public Double getX2() {
		return x2;
	}

	public String toString() {
		return a + "x^2 + " + b + "x + " + c + " = 0";
	}
}
