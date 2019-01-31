import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RechnungTest {

	@Test
	void test() {
		Rechnung testRechnung = new Rechnung();
		assertTrue(testRechnung.kreisberechnung()>10);
	}
	
	@Test
	void test2() {
		Rechnung testRechnung2 = new Rechnung();
		assertFalse(testRechnung2.kreisberechnung()==10);
	}
}