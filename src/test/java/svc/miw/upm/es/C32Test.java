package svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

	@Before
	public void before() {
		new C32();

	}

	@Test
	public void testmA() {
		assertEquals("mA", C32.mA());

	}

}
