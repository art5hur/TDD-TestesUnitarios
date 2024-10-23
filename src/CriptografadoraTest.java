import static org.junit.Assert.*;

import org.junit.Test;

public class CriptografadoraTest {

	@Test
	public void testConversaoLetraA() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('A');
		assertEquals(valorConvertido, 19);
	}
	
	@Test
	public void testConversaoLetraB() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('B');
		assertEquals(valorConvertido, 11);
	}
	
	@Test
	public void testConversaoLetraC() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('C');
		assertEquals(valorConvertido, 71);
	}
	
	@Test
	public void testConversaoLetra() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('a');
		assertEquals(valorConvertido, 0);
	}

}
