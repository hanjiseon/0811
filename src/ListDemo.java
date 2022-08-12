import java.util.Stack;

//List 중복 허용

/*
 * Stack" LIFO Last Input First Out
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String [] array = {"박지민", "홍지민","박지민","한지민","한지민","이지민"};
		for(String str :array) {
			stack.push(str);
		}
		System.out.println(stack.search("김지민"));
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}
}
