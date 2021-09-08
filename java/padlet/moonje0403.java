package padlet;

class Dog {
	String name;
	int age;
	String gender;
	
	public Dog() {
		name="기본이름";
		age=0;
		gender="기본성별";
	}
	public Dog(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void doginfo() {
		System.out.printf("이름:%s, 나이:%d 성별:%s", name,age,gender);
	}
}

public class moonje0403 {

	public static void main(String[] args) {
		Dog d1=new Dog("시고르자브종",9,"수컷");
		d1.doginfo();

	}

}
