package testci;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class CircleTest {
	Circle c;
	
	@Before
	public void before() {
		this.c = new Circle(2,2,3);
	}
	
	@Test
	public void testGetPerimeter() {
		Assert.assertEquals(18.84, this.c.getPerimeter(), 0.0001);
	}
}
