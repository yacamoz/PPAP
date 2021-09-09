package abstract_practice;

abstract class animals{
	public abstract void sound();
	
	
	//1개 이상의 추상메소드를 가지는 클래스=추상클래스
}

class lion extends animals{
	public void sound() {
		System.out.println("ㅇㅎ");
	}
	
	public void hunt() {
		System.out.printf("다른 동물을 사냥!");
	}
}

public class animal {

}
