package dad.codesignal;

import static org.junit.Assert.assertEquals;

import javax.management.RuntimeErrorException;

import org.junit.Before;
import org.junit.Test;

public class AddTest {
	
	private  TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(3, tjb.add(1, 2));
	}
	
	@Test
	public void test2() {
		//assert throw new RuntimeException("error");
		assertEquals(8, tjb.add(10, -2));
	}
	
	@Test
	public void test3() {
		assertEquals(5, tjb.add(2, 3));
	}
	
	@Test
	public void test1Anio() {
		assertEquals(13, tjb.centuryFromYear(1234));
	}@Test
	public void test2Anio() {
		assertEquals(20, tjb.centuryFromYear(1985));
	}

}
