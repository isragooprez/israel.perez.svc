package svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

	public C31Test() {
		// TODO Auto-generated constructor stub
	}

	@Before
	public void before() {
		new C31();

	}

	@Test
	public void testm1() {
		assertEquals("m1", C31.m1());
	}

	@Test
	public void testm2() {
		assertEquals("m2", C31.m2());
	}

}
