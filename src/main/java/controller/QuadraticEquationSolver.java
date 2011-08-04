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

	public QuadraticEquationSolver() {
		quadraticEcuation = new QuadraticEquation();
	}

	public QuadraticEquationSolver(QuadraticEquation quadraticEcuation) {
		this.quadraticEcuation = quadraticEcuation;
	}

	/**
	 * Returns the delta value of the quadratic equation.
	 * 
	 * @return The delta value of the quadratic equation.
	 */
	public Double getDelta() {
		return quadraticEcuation.getB() * quadraticEcuation.getB()
				- (4 * quadraticEcuation.getA() * quadraticEcuation.getC());
	}

	/**
	 * Solves the quadratic equation and sets its roots.
	 * 
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
