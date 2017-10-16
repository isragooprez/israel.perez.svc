package svc.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

	@Before
	public void before() {
		new C52();
	}

	@Test
	public void testmA() {
		assertEquals("mA", C52.mA());

	}

}
