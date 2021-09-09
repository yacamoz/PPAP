package serchprac;

class smartphone{
	private String name;
	private String company;
	private int price;
	private String provider;
	private int weight;
	private String color;
	private boolean rvt;

	public smartphone() {
		name="기본이름";
		company="기본회사";
		price = 0;
		provider = "기본통신사";
		weight=0;
		color = "무색";
		rvt=false;
	}
	
	public smartphone(String name, String company, int price, String provider, int weight, String color) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.provider = provider;
		this.weight = weight;
		this.color = color;
		this.rvt = false;
	}
	
	public void setrvt(boolean rvt) {
		this.rvt = rvt;
	}
	
	public boolean getrvt() {
		return rvt;
	}
	
	public void phoneinfo() {
		System.out.printf("제품명:%s\n", name);
		System.out.printf("제조사:%s\n", company);
		System.out.printf("가격:%d만원\n", price);
		System.out.printf("통신사:%s\n", provider);
		System.out.printf("무게:%dg\n", weight);
		System.out.printf("색상:%s\n", color);
	}
	public String getname() {
		return name;
	}
	public String getcom() {
		return company;
	}
	public int getprice() {
		return price;
	}
}// class end

public class jong {

	public static void main(String[] args) {
		

	}

}
