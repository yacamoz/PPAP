package padlet;

class Dog {
	String name;
	int age;
	String gender;
	
	public Dog() {
		name="�⺻�̸�";
		age=0;
		gender="�⺻����";
	}
	public Dog(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void doginfo() {
		System.out.printf("�̸�:%s, ����:%d ����:%s", name,age,gender);
	}
}

public class moonje0403 {

	public static void main(String[] args) {
		Dog d1=new Dog("�ð��ں���",9,"����");
		d1.doginfo();

	}

}
