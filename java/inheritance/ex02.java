package inheritance;

class Person{
	private String name;
	private int age;
	private double height;
	
	public Person() {
		name = "�浿��";
		age = 0;
		height = 0;
		
	}
	public Person(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	void say() {
		System.out.println("saying");
	}
	void walk() {	
		System.out.println("walking");
	}
	void eat() {
	System.out.println("eating");
	}
	void introduce() {
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("����:%d\n", age);
		System.out.printf("Ű:%.1f\n", height);
	}
	
}

class Student extends Person {
	private double score;
	private int grade;
	
	public Student() {
		score = 0;
		grade = 0;
		
	}
	public Student(String name, int age, double height, double score, int grade) {
		super(name, age, height);
		this.score = score;
		this.grade = grade;
	}
	void learn() {
		System.out.println("learning");
	}
	void eat() {
		System.out.println("2times eating");
		super.eat();
	}
	void introduce() {
		super.introduce();
		System.out.printf("�г�:%d", grade);
		System.out.printf("����:%.1f\n", score);
	}
	
}

class Teacher extends Person {
	void teach() {
		System.out.println("teaching");
	}
}

class leader extends Student{
	void lead() {
		System.out.println("leading");
	}
	void say() {
		System.out.println("Say to Teacher");
	}
	void eat() {
		System.out.println("3times eating");
		super.eat();
	}
}

class Employee extends Person {
	String rank;
	int salary;
	
	public Employee() {
		rank="����";
		salary=0;
	}
	
	public Employee(String name, int age, double height, String rank, int salary) {
		super(name, age, height);
		this.rank = rank;
		this.salary = salary;
	}
	
	public void introduce() {
		super.introduce();
		System.out.printf("����:%s\n", rank);
		System.out.printf("����:%d\n", salary);
	}
}
public class ex02 {

	public static void main(String[] args) {
		Person p1 = new Person("������",53,168);
		Student s1 = new Student("������",45,155,6,91);
		Employee e1 = new Employee("����",65,175,"��������",500000);
		p1.introduce();
		s1.introduce();
		e1.introduce();
	}

}
