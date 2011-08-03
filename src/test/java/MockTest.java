import junit.framework.Assert;

import model.QuadraticEquation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import controller.QuadraticEquationSolver;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ QuadraticEquationSolver.class })
public class MockTest {

	QuadraticEquation equation;
	QuadraticEquationSolver quadraticEquationSolver;

	@Before
	public void setUp() {
		equation = new QuadraticEquation(new Double(2), new Double(-2),
				new Double(-4));
		quadraticEquationSolver = new QuadraticEquationSolver(equation);
	}

	@Test
	public void testGetDelta() {
		Assert.assertEquals(quadraticEquationSolver.getDelta(), new Double(36));
	}

	@Test
	public void testSolveQuadraticEquation() {
		quadraticEquationSolver.solveQuadraticEquation();
		Assert.assertEquals(equation.getX1(), new Double(-1));
		Assert.assertEquals(equation.getX2(), new Double(2));
	}

	@After
	public void tearDow() {
		quadraticEquationSolver = null;
	}
}
