package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Cuenta;

public class CuentaTest {
	private Cuenta cuenta;
	@BeforeEach
	public void setUp() {
		this.cuenta = new Cuenta(1, 5000, "A");
	}
	
	@Test
	public void consignarTest() {
		assertEquals(5500, cuenta.consignar(500));
	}
	
	@Test
	public void retirarTest() {
		assertTrue(cuenta.retirar(3000));
		assertFalse(cuenta.retirar(6000));
	}
}
