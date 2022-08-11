import org.junit.runners.ParentRunner;

/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * <li><b>Final Variable</b>: 자바의 상수</li>
 * <li><b>Final Method</b>: Override의 금지</li>
 * <li><b>Final Class</b>: 상속의 금지</li> </ui>
 * 
 * @author HanJiSeon
 * @version 1.1
 * @since 2022-08-11
 * 
 */

public class FinalDemo extends Parent {

	private final double PI = Math.PI; // member variable
	private static final boolean FLAG = true; // static Constant

	public static void main(String[] args) {
		// 상수를 바꿀 수 없다.
		final String NAME = "한지민"; // Local Constant

	}

	public final void display() {
		System.out.println("나는 자식의 메소드");
	}

//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
//	
//}
	class final Parent {
		public final void display() { 
			System.out.println("나는 부모의 메소드");
		}
	}

//
//abstract class Super {            
//	public final void display() {                    //final-> 재정의X
//		System.out.println("나는 부모의 메소드");
//	}

//	public abstract void print();
//
//}
