package test.java;

import main.java.Vec;
import main.java.Vec3;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VecTest {
	private static Vec3 vec1;
	private static Vec3 vec2;

	@BeforeEach
	void setupMatrix() {
		vec1 = new Vec3(10, 10, 10);
		vec2 = new Vec3(5, 5, 5);
	}

	@Test
	void add() {
		Vec3 res = Vec.add(vec1, vec2);
		assertEquals(res.getX(), 15);
		assertEquals(res.getY(), 15);
		assertEquals(res.getZ(), 15);
	}

	@Test
	void subtract() {
		Vec3 res = Vec.subtract(vec1, vec2);
		assertEquals(res.getX(), 5);
		assertEquals(res.getY(), 5);
		assertEquals(res.getZ(), 5);
	}
}
