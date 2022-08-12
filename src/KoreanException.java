/*
 * 사용자 정의형 Exception
 * 1. 누구의 자식인가? RuntimeException 계열인가? 아닌가?
 * 2. 생성자를 잘 만들자
 * 
 * 
 * KoreanException은 RuntimeException의 subclass -> Unchecked Exception
 */
public class KoreanException extends RuntimeException {
	public KoreanException(String msg) {
		super(msg);
	}

}
