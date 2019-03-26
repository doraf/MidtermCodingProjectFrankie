package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class testCuboid {

	@Test
	public void test() {
		Cuboid cuboid1 = new Cuboid(1,1,1);
		assertEquals(cuboid1.getDepth(), 1);
		assertEquals(cuboid1.area(), 6);
		assertEquals(cuboid1.volume(), 1);
		
		
		fail("Not yet implemented");
	}

}
