package controller;

import model.Equation;

/**
 * Provides operations that solve an equation.
 * 
 * @author romina.milea
 */
public interface EquationSolver {

	/**
	 * Solves the specified quadratic equation of this class.
	 * 
	 * @param equation
	 *            the quadratic equation
	 */
	void solve(Equation equation);

}
