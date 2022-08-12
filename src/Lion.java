/*
 * Method's Override 조건 3가지
 * 1. 이름, 리턴타입, 괄호가 같아야한다.'
 * 2. 메소드의 접근제한자는 부모보다 같거나 더 넓어야 한다.
 * 3.자식의 Exception은 부모의 Exception 보다 더 적어야 한다.
 */
public class Lion extends Mammal {

	@Override
	public void saySomething()  throws RuntimeException {
		// TODO Auto-generated method stub

	}

}
