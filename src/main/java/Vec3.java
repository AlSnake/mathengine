package main.java;

public class Vec3 {
	private float x, y, z;

	public Vec3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

	public void add(Vec3 vec) {
		x += vec.x;
		y += vec.y;
		z += vec.z;
	}

	public void subtract(Vec3 vec) {
		x -= vec.x;
		y -= vec.y;
		z -= vec.z;
	}

	public void scale(float scalar) {
		x *= scalar;
		y *= scalar;
		z *= scalar;
	}

	@Override
	public String toString() {
		return "Vec3{" +
				"x=" + x +
				", y=" + y +
				", z=" + z +
				'}';
	}
}
