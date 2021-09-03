package inheritance;

class Shape{
	double garo;
	double sero;
	public Shape() {
		garo = 0;
		sero = 0;
	}
	public Shape(double garo, double sero) {
		this.garo=garo;
		this.sero=sero;
	}
	public double nulbi() {
		System.out.printf("≥–¿Ã:%.1f\n", garo*sero);
		return garo*sero;
	}
}

class Triangle extends Shape {
	public Triangle() {
		garo = 0;
		sero = 0;
	}
	public Triangle(double garo, double sero) {
		super(garo, sero);
	}
	public double nulbi() {
		double result = 0;
		result = garo*sero/2;
		System.out.printf("≥–¿Ã:%.1f\n", result);
		return result;
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		garo = 0;
		sero = 0;
	}
	public Rectangle(double garo, double sero) {
		super(garo,sero);
	}
}

public class ex03 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,2);
		Rectangle R1 = new Rectangle(3,3);
		t1.nulbi();
		R1.nulbi();

	}

}
