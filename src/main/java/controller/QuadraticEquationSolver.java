package controller;

import model.QuadraticEquation;

/**
 * Provides operations that solve an equation of second degree.
 * 
 * @author romina.milea
 * 
 */
public class QuadraticEquationSolver {

	private QuadraticEquation quadraticEcuation;

	/**
	 * Constructs a new QuadraticEquationSolver object.
	 */
	public QuadraticEquationSolver() {
		quadraticEcuation = new QuadraticEquation();
	}

	/**
	 * Constructs a new QuadraticEquationSolver object having a specific
	 * equation of second degree.
	 * 
	 * @param quadraticEcuation
	 *            the equation of second degree to be set the quadratic equation
	 *            of this class.
	 */
	public QuadraticEquationSolver(QuadraticEquation quadraticEcuation) {
		this.quadraticEcuation = quadraticEcuation;
	}

	/**
	 * Returns the delta value of the quadratic equation of this class.
	 * 
	 * @return The delta value of the quadratic equation of this class
	 */
	public Double getDelta() {
		return quadraticEcuation.getB() * quadraticEcuation.getB()
				- (4 * quadraticEcuation.getA() * quadraticEcuation.getC());
	}

	/**
	 * Solves the quadratic equation of this class.
	 */
	public void solveQuadraticEquation() {
		if (getDelta() < 0) {
			System.out.println("Equation solutions are not real numbers");
		} else {
			Double x1 = (-1 * quadraticEcuation.getB() - Math.sqrt(getDelta()))
					/ (2 * quadraticEcuation.getA());
			Double x2 = (-1 * quadraticEcuation.getB() + Math.sqrt(getDelta()))
					/ (2 * quadraticEcuation.getA());
			quadraticEcuation.setX1(x1);
			quadraticEcuation.setX2(x2);
		}
	}

}
