package padlet;

class student01{
	private String name;
	private int scnum;
	private String gender;
	
	public student01() {
		name = "기본이름";
		scnum=0;
		gender="기본성별";
	}
	public student01(String name, int scnum, String gender) {
		this.name=name;
		this.scnum=scnum;
		this.gender=gender;
	}
	public void numchan (int num) {
		this.scnum=num;
	}
	public void stuinfo() {
		System.out.printf("이름:%s\n학번:%d\n성별:%s", name, scnum, gender);
	}
}

public class moonje0303 {

	public static void main(String[] args) {
		student01 stu1=new student01("이동준",2009038033,"남");
		stu1.stuinfo();

	}

}
