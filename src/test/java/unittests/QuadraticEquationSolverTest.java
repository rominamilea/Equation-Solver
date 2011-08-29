package unittests;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import junit.framework.JUnit4TestAdapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.QuadraticEquationSolver;

import model.QuadraticEquation;

public class QuadraticEquationSolverTest {

	private QuadraticEquation equation;

	private QuadraticEquationSolver quadraticEquationSolver;

	@Before
	public void setUp() {
		Double[] coefficients = new Double[] {2.00, -2.00, -4.00};
		equation = new QuadraticEquation(coefficients);
		quadraticEquationSolver = new QuadraticEquationSolver();
	}

	@After
	public void tearDow() {
		quadraticEquationSolver = null;
		equation = null;
	}

	@Test
	public void testSolve() {
		quadraticEquationSolver.solve(equation);

		assertEquals(equation.getX1(), -1.00);
		assertEquals(equation.getX2(), 2.00);
	}

	public static Test suite() {
		return (Test) new JUnit4TestAdapter(QuadraticEquationSolverTest.class);
	}
}
