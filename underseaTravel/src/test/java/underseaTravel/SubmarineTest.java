package underseaTravel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubmarineTest {

	/*
	 * a posição inicial de todos submarinos inicializados deve ser 0,0,0,NORTE
	 */
	@Test
	public void assertInitialPosition() {
		Submarine submarine1 = new Submarine();
		assertEquals("0 0 0 NORTE", submarine1.getPosition().toString());
	}

}
