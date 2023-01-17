package gradledemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculateIntrest()
	{
		Calculator obj =new Calculator();
		float expected= obj.calculateIntrest(50,6,7);
		float actual=21;
		assertEquals(expected,actual,0.0);
		
	}

	
	}


