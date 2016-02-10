import static org.junit.Assert.*;

import org.junit.Test;


public class vehicleTests {

	@Test
	public void test1() throws CloneNotSupportedException {
		Truck suv = new Truck(4);
		Truck co = (Truck) suv.clone();
		assertEquals(suv.getX(), co.getX());
		assertEquals(suv.getY(), co.getY());
	}
	
	@Test
	public void test2() throws CloneNotSupportedException {
		Truck suv = new Truck(4);
		Truck co = (Truck) suv.clone();
		assertEquals(suv.getClass(), co.getClass());
	}
	

}
