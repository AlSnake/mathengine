package test.java;

import main.java.Vec3;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Vec3Test {
	private static Vec3 vec;

	@BeforeEach
	void setupMatrix() {
		vec = new Vec3(5, 5, 5);
	}

	@Test
	void add() {
		vec.add(new Vec3(10, 11, 12));
		assertEquals(vec.getX(), 15);
		assertEquals(vec.getY(), 16);
		assertEquals(vec.getZ(), 17);
	}

	@Test
	void subtract() {
		vec.subtract(new Vec3(2, 1, 3));
		assertEquals(vec.getX(), 3);
		assertEquals(vec.getY(), 4);
		assertEquals(vec.getZ(), 2);
	}

	@Test
	void scale() {
		vec.scale(10);
		assertEquals(vec.getX(), 50);
		assertEquals(vec.getY(), 50);
		assertEquals(vec.getZ(), 50);
	}
}
