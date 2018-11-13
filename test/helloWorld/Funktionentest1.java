package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Funktionen;

public class Funktionentest1 {

	@Test
	public void add() {
		{
			final int exspected =10;
			
			final int actual = Funktionen.add(5, 5);
			
			assertEquals(exspected, actual);
		}
		fail("Not yet implemented");
	}
	@Test
	public void multiply() {
		final int exspected = 10;
		final int actual = Funktionen.multiply(2, 5);
		assertEquals(exspected, actual);
	}
	
	@Test
	public void divide() {
		final double exspected = 10;
		final double actual = Funktionen.divide(100, 10);
		assertEquals(exspected, actual);
	}
}
Jans test funktioniert nicht


	


