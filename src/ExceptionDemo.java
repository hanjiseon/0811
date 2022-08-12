import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int first = sc.nextInt();

		System.out.print("두 번째 숫자: ");
		int second = sc.nextInt();
		try {
			System.out.printf("%d / %d = %d\n", first, second, (first / second));
		} catch (RuntimeException ex) {
			System.out.println("여기서 잡음");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (NegativeArraySizeException ex) {
			System.out.println("NegativeArraySizeException");
		}
/*
 * Multiple Catch Block: 여러개의 Exception Type을 열거하는 방법
 * 주의할 점: 위아래 순서가 있다. 왼쪽은 Exception, 아래쪽은 부모 Exception
 */
	}
}
