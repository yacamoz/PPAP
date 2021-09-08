package padlet;

class student{
	private String name;
	private int scnum;
	private String gender;
	
	public student() {
		name = "기본이름";
		scnum=0;
		gender="기본성별";
	}
	public student(String name, int scnum, String gender) {
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

public class moonje0203 {

	public static void main(String[] args) {
		student[] stu=new student[2];
		stu[0]=new student("이동준", 2009098033, "남");
		stu[1]=new student("이제영", 2007012034, "여");
		stu[0].numchan(2019038033);
		stu[0].stuinfo();
		stu[1].stuinfo();
	}

}
