public class AnnoymousClassDemo {

	public static void main(String[] args) {
		Demo d = new Demo() { // 익명 객체

			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}

			public void print() {                                            //재정의의 원형이 없음, 익명객체는 새로운 기능을 추가 하지는 못한다.
				System.out.println("나는 새로운 메소드");
			}
		}; // 매우 주의할 것
		d.display();
//		d.print();					//재정의하려는 클래스에 멤버가 아니기 때문에 (정의되어 있지 않아서)
	}

}

class Demo {
	public void display() {
		System.out.println("나는 원형 메소드");
	}

}
