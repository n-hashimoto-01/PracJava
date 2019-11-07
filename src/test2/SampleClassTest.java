package test2;

import test.SampleClass;
import test.ApplicationException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleClassTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcInformation_success() {
		SampleClass a = new SampleClass();
		a.setName("abc");
		a.setId("2");
		a.setValue("information");
		assertEquals("abc", a.getName());
		assertEquals("2", a.getId());
		assertEquals("information", a.getValue());
		try {
			int retValue = a.calcInfomation();
			assertEquals(2, retValue);
		} catch (ApplicationException e) {}
	}
	@Test
	void testCalcInformation_failNunberFormat() {
		SampleClass a = new SampleClass();
		a.setId("a");
		try {
			int retValue = a.calcInfomation();
			fail("dame");
		} catch (ApplicationException e) {
			assertSame(NumberFormatException.class, e.getInnerException().getClass());
		}
	}

}
