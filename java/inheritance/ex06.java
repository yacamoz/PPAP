package inheritance;

class myperson{
	String name;
	int age;
	double height;
	
	public myperson() {
		name="홍길동";
		age=0;
		height = 0;
	}
	public myperson(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void introduce() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("키:%.1f\n", height);
	}
	
	public int getAGE() {
		return age;
	}
	public void setAGE(int age) {
		this.age=age;
	}
}

class mystudent extends myperson{
	private int scnum;
	private int grade;
	private String depart;
	private double gpa;
	
	public mystudent() {
		scnum=100;
		grade=0;
		depart="짜유전공";
		gpa=0;
	}
	public mystudent(String name, int age, double height, int scnum, int grade, String depart, double gpa) {
		super(name, age, height);
		this.scnum=scnum;
		this.grade=grade;
		this.depart=depart;
		this.gpa=gpa;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("학번:%d\n", scnum);
		System.out.printf("학년:%d\n", grade);
		System.out.printf("전공:%s\n", depart);
		System.out.printf("학점:%.1f\n", gpa);
	}
	public void graduate() {
		if(gpa>=150) {
			System.out.printf("졸업가능");
		}
		else {
			System.out.print("학점부족");
		}
	}
}


public class ex06 {

	public static void main(String[] args) {
		mystudent[] starr = new mystudent[3];
		starr[0] = new mystudent("엄복동", 25, 170, 5252, 4, "자전거절도", 149);
		starr[1] = new mystudent("스틸곽", 28, 173, 8282, 3, "차량절도", 165);
		starr[2] = new mystudent("스티븐유", 35, 180, 8090, 5, "탈영학", 155);
	starr[0].graduate();
	starr[1].graduate();
	starr[2].graduate();
	}

}
