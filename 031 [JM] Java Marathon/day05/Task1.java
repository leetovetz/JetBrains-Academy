package day05;

public class Task1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("black");
		car.setYear(2000);
		car.setModel("audi");
		
		System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " +
				car.getColor() + " color ");

	}
}
