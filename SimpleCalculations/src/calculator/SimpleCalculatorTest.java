package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	SimpleCalculator sc = new SimpleCalculator();
	
	@Test
	public void test() {
		
		assertEquals(3,sc.calculation(1, 2, "+"));
		assertEquals(5,sc.calculation(10, 2, "/"));
		assertEquals(20,sc.calculation(10, 2, "*"));
		assertEquals(14,sc.calculation(16, 2, "-"));
	}

}
