/*
 * checked Exception
 * 1) 반드시 try ~ catch
 * 2) 메소드의 선언부에 throws MathException
 */
public class MathException extends Exception {
	
	public MathException(String msg) {
		super(msg);
	}
	
	

}
