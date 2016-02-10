import static org.junit.Assert.*;

import org.junit.Test;

public class findLastTests {

	@Test
	public void test() {
		findLast object = new findLast();
		int[] x = {2, 3, 5};
		int result = object.findLast(x, 2);
		assertEquals(0, result);
	}
	
}
