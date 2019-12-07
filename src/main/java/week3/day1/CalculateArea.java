package week3.day1;

public class CalculateArea {

	public int computeArea(int a) {
		return a*a;
	}
	
	public float computeArea(float a) {
		return a*a;
	}
	
	public int computeArea(int l, int b) {
		return l*b;
	}
	
	public float computeArea(float l, float b) {
		return l*b;
	}
	
	public static void main(String[] args) {
		CalculateArea ca = new CalculateArea();
		System.out.println("int SquareArea       " + ca.computeArea(5));
		System.out.println("float SquareArea     " + ca.computeArea(5.45f));
		System.out.println("int RectangleArea    " + ca.computeArea(5, 10));
		System.out.println("float RectangleArea  " + ca.computeArea(5.5f, 10.5f));

	}

}
