
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t = null;
		try {
			t.display();
		} catch (NullPointerException ex) {
//			System.out.println(ex.getMessage());
			System.out.println(ex); // ex.toString()
			ex.printStackTrace();
		}
	}

}

class Test {
	public void display() {
		System.out.println("Hello World");
	}
}
