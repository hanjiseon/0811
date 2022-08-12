import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws FileNotFoundException  {
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		try {
//			Scanner sc = new Scanner(file, "utf-8");
//		} catch (FileNotFoundException e) {
			
//			e.printStackTrace();
//		} 
		System.out.print("숫자형 글자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String num  = sc.nextLine();
		int su = Integer.parseInt(num);
		System.out.printf("su = %d\n",su);
	}

}
