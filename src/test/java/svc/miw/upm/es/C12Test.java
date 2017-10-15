package svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

	@Before
	public void before() {
		new C12();
	}

	@Test
	public void testmA() {
		assertEquals("mA", C12.mA());
	}

}
