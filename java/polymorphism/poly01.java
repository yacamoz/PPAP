package polymorphism;

//polymorphism:다형성
//poly가 많은
//자식 타입 변수에 부모 객체를 담을 수 없고, 부모 타입 변수에 자식 객체를 담을 수 있다.
//dog d = new animal();-> 불가능, animal ani = new dog();->가능
//다형성의 장점은 부모 타입의 변수로 자식의 객체를 사용가능하다.
class animal{
	public void sound() {
		System.out.println("울음소리 모름!");
	}
}

class cat extends animal {
	public void sound() {
		System.out.println("니아옹");
	}
}

class dog extends animal {
	public void sound() {
		System.out.println("무엉무엉0");
	}
}

public class poly01 {

	public static void main(String[] args) {
		animal ani = null; //가능
		animal anr[]=new animal[3];
		anr[0]=new dog();
		anr[1]=new cat();
		anr[2]=new dog();
		for(int i=0;i<3;i++) {
			anr[i].sound();
		}
	}

}
