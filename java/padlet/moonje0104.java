package padlet;

class cat {
	String name;
	String gender;
	int age;
	
	public cat() {
		name = "떼껄룩";
		gender="무성";
		age=0;
	}
	public cat(String name, String gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public void catinfo() {
		System.out.printf("고양이 이름:%s\n", name);
		System.out.printf("고양이 성별:%s\n", gender);
		System.out.printf("고양이 나이:%d\n", age);
	}
}

public class moonje0104 {

	public static void main(String[] args) {
		cat c1 = new cat("삼색이", "암컷", 5);
		cat c2 = new cat("야통이", "수컷", 4);
		c1.catinfo();
		c2.catinfo();
	}

}
