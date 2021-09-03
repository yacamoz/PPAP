package studentprac;

class student01{
	private String name;
	private int grade;
	private double guk=0, young=0, su=0, total=0, avg=0;
	
	public void student01() {
		name="홍길동";
		grade=0;
		guk=0;
		young=0;
		su=0;
		total=0;
		avg=0;
	}
	
	public student01(String name, int grade, double guk, double young, double su){
		this.name = name;
		this.grade=grade;
		this.guk=guk;
		this.young=young;
		this.su=su;
	}
	public double calto() {
		double result = 0;
		result = guk+young+su;
		this.total = result;
		return total;
	}
	public double calavg() {
		double result = 0;
		result = (guk+young+su)/3;
		this.avg = result;
		return avg;}
	public void stdinfo() {
		System.out.printf("이름:%s \n", name);
		System.out.printf("학년:%d학년 \n", grade);
		System.out.printf("국어:%.1f \n", guk);
		System.out.printf("영어:%.1f \n", young);
		System.out.printf("수학:%.1f \n", su);
		System.out.printf("총합:%.1f \n", total);
		System.out.printf("평균:%.1f \n", avg);
	}
}
