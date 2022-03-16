package main.java;

public class Vec {
	public static Vec3 add(Vec3 vec1, Vec3 vec2) {
		return new Vec3(vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY(), vec1.getZ() + vec2.getZ());
	}

	public static Vec3 subtract(Vec3 vec1, Vec3 vec2) {
		return new Vec3(vec1.getX() - vec2.getX(), vec1.getY() - vec2.getY(), vec1.getZ() - vec2.getZ());
	}
}
