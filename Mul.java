package test;

public class Mul {
	public static void main(String[] args) {
		for (int number = 2; number <= 10; number++) {
			System.out.println("----*****----");
			for (int counter = 1; counter <= 12; counter += 1) {
				System.out.println(number + " * " + counter + " = "
						+ (number * counter));
			}
		}

	}
}
