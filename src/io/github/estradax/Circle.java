package io.github.estradax;

public class Circle extends Shape {
	private float radius;
	private int center;

	private final Point point;

	public Circle(Point point) {
		this.point = point;
	}

	public double area(float radius) {
		return 0;
	}

	public void circum() {}
	public void setCenter() {}
	public void setRadius() {}
}
