package day05b;

public class Task2 {

	public static void main(String[] args) {
		Motorcycle motorcycle = new Motorcycle(2010, "Suzuki", "red");
		System.out.println(motorcycle.getModel() + "\n" + 
				motorcycle.getColor() + "\n" + 
				motorcycle.getYear());
	}
}
