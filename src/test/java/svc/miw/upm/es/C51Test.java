package svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

	@Before
	public void before() {
		new C51();
	}

	@Test
	public void testm1() {
		assertEquals("m1", C51.m1());

	}

	@Test
	public void testm2() {
		assertEquals("m2", C51.m2());

	}

}
