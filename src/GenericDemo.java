public class GenericDemo {

	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5); 
		int result = car.getValue();
		
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue();
		
		Car<String> car2 = new Car<String>("Hello");
		String result2 = car2.getValue();
	}
}

class Car<T> {
	private T value;

	public Car(T value) {
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
