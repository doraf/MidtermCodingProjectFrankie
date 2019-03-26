package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class rectangleTest {
	
	@Test
	public void test() {
		Rectangle rectangle1 = new Rectangle(1,1);
		assertEquals(rectangle1.getWidth(), 1);
		assertEquals(rectangle1.getLength(), 1);
		assertEquals(rectangle1.area(), 1);
		assertEquals(rectangle1.perimeter(), 4);
		
		fail("Not yet implemented");
	}

}
