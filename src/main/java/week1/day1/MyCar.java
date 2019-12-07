package week1.day1;

public class MyCar {
public static void main(String []args) {
	Car car = new Car();
	int speed = car.maxSpeed();
	System.out.println(speed);
	double pressure = car.airPressure();
	System.out.println(pressure);
}
}
