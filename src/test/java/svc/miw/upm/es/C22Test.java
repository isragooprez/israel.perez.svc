package svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

	@Before
	public void before() {
		new C22();

	}
	@Test
	public void testmA() {
		assertEquals("mA",C22.mA());

	}

}
