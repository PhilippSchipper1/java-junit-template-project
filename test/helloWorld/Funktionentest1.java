package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.Funktionen;

public class Funktionentest1 {

	@Test
	public void add() {
		{
			final int expected =10;
			
			final int actual = Funktionen.add(5, 5);
			
			assertEquals(expected, actual);
		}
		fail("Not yet implemented");
	}

}



	


