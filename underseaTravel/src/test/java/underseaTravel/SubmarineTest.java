package underseaTravel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SubmarineTest {

	/*
	 * a posição inicial de todos submarinos inicializados deve ser 0,0,0,NORTE
	 */
	@Test
	public void initialPositionTest() {
		Submarine submarine1 = new Submarine();
		assertEquals("0 0 0 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * a mensagem de erro deve retornar todos os comandos inválidos
	 */
	@Test
	public void errorMessageTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("ABDC");
		assertEquals("Comando(s) \"ABC\" não reconhecido(s)", submarine1.getErrorMessage());

		submarine1.move("D");
		assertNull(submarine1.getErrorMessage());
		
		submarine1.move("Z");
		assertEquals("Comando(s) \"Z\" não reconhecido(s)", submarine1.getErrorMessage());
	}
	
	/*
	 * o submarino deve virar a direita 
	 */
	@Test
	public void turnRightTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("R");
		assertEquals("0 0 0 LESTE", submarine1.getPosition().toString());
		
		submarine1.move("R");
		assertEquals("0 0 0 SUL", submarine1.getPosition().toString());
		
		submarine1.move("R");
		assertEquals("0 0 0 OESTE", submarine1.getPosition().toString());
		
		submarine1.move("R");
		assertEquals("0 0 0 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * o submarino deve virar a esquerda 
	 */
	@Test
	public void turnLeftTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("L");
		assertEquals("0 0 0 OESTE", submarine1.getPosition().toString());

		submarine1.move("L");
		assertEquals("0 0 0 SUL", submarine1.getPosition().toString());

		submarine1.move("L");
		assertEquals("0 0 0 LESTE", submarine1.getPosition().toString());

		submarine1.move("L");
		assertEquals("0 0 0 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * o submarino deve mover para o norte
	 */
	@Test
	public void moveNorthTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("M");
		assertEquals("0 1 0 NORTE", submarine1.getPosition().toString());
		
	}
	
	/*
	 * o submarino deve mover para o leste
	 */
	@Test
	public void moveEastTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("RM");
		assertEquals("1 0 0 LESTE", submarine1.getPosition().toString());
		
	}
	
	/*
	 * o submarino deve mover para o sul
	 */
	@Test
	public void moveSouthTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("RRM");
		assertEquals("0 -1 0 SUL", submarine1.getPosition().toString());
		
	}
	
	/*
	 * o submarino deve mover para o Oeste
	 */
	@Test
	public void moveWestTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("LM");
		assertEquals("-1 0 0 OESTE", submarine1.getPosition().toString());
		
	}
	
	/*
	 * o submarino deve submergir
	 */
	@Test
	public void moveDownTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("D");
		assertEquals("0 0 -1 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * o submarino deve emergir até a superfície do oceano
	 */
	@Test
	public void moveUpTest() {
		Submarine submarine1 = new Submarine();
		submarine1.move("D");
		assertEquals("0 0 -1 NORTE", submarine1.getPosition().toString());
		
		submarine1.move("UUU");
		assertEquals("0 0 0 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * Os comandos LMRDDMMUU devem levar a posição -1 2 0 NORTE
	 */
	@Test
	public void move_LMRDDMMUU_Test() {
		Submarine submarine1 = new Submarine();
		submarine1.move("LMRDDMMUU");
		assertEquals("-1 2 0 NORTE", submarine1.getPosition().toString());
	}
	
	/*
	 * Os comandos RMMLMMMDDLL devem levar a posição 2 3 -2 SUL
	 */
	@Test
	public void move_RMMLMMMDDLL_Test() {
		Submarine submarine1 = new Submarine();
		submarine1.move("RMMLMMMDDLL");
		assertEquals("2 3 -2 SUL", submarine1.getPosition().toString());
	}
	
	/*
	 * O submarino não deve ultrapassar a profundidade maxima
	 */
	@Test
	public void maxDepthTest() {
		Submarine submarine1 = new Submarine();
		submarine1.setMaxDepth(-10);
		
		submarine1.move("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"
				+ "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"
				+ "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"
				+ "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD"
				+ "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

		assertEquals("0 0 -10 NORTE", submarine1.getPosition().toString());
		
		
	}
}
