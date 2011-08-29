package controller;

import model.QuadraticEquation;

/**
 * Provides operations that solve an equation of second degree.
 * 
 * @author romina.milea
 * 
 */
public class QuadraticEquationSolver {

	/**
	 * Constructs a new QuadraticEquationSolver object.
	 */
	public QuadraticEquationSolver() {
	}

	/**
	 * Returns the delta value of the specified quadratic equation.
	 * 
	 * @param equation
	 *            the quadratic equation
	 * @return delta value
	 */
	private Double getDelta(QuadraticEquation equation) {
		return (equation.getCoefficients()[1] * equation.getCoefficients()[1] - (4 * equation
				.getCoefficients()[0] * equation.getCoefficients()[2]));
	}

	/**
	 * Solves the specified quadratic equation of this class.
	 * 
	 * @param equation
	 *            the quadratic equation
	 */
	public void solve(QuadraticEquation equation) {

		if (getDelta(equation) < 0) {
			System.err.println("Equation solutions are not real numbers");
			return;
		}

		Double x1 = (-1 * equation.getCoefficients()[1] - 
					Math.sqrt(getDelta(equation))) / (2 * equation.getCoefficients()[0]);
		Double x2 = (-1 * equation.getCoefficients()[1] + 
					Math.sqrt(getDelta(equation))) / (2 * equation.getCoefficients()[0]);
		equation.setX1(x1);
		equation.setX2(x2);

	}

}
