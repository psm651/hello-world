package first;

public class CarExam3 {
	String Car;
	public static void main(String[] args) {
		Car c1 = new Car("소방차");
		Car c2 = new Car();
		Car c3 = new Car("경찰차", 2052);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

	
}
