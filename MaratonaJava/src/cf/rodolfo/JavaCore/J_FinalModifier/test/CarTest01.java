package cf.rodolfo.JavaCore.J_FinalModifier.test;

import cf.rodolfo.JavaCore.J_FinalModifier.domain.Car;
import cf.rodolfo.JavaCore.J_FinalModifier.domain.Ferrari;

public class CarTest01 {
	public static void main(String[] args) {
		Car car = new Car();

		System.out.println(Car.SPEED_LIMIT);
		System.out.println(car.CUSTOMER);
		car.CUSTOMER.setName("Hagrid");
		System.out.println(car.CUSTOMER);
		
		Ferrari ferrari = new Ferrari();
		ferrari.setName("Lucius");
		ferrari.printInfo();
		
	}

}
