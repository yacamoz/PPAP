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
		name="�⺻�̸�";
		company="�⺻ȸ��";
		price = 0;
		provider = "�⺻��Ż�";
		weight=0;
		color = "����";
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
		System.out.printf("��ǰ��:%s\n", name);
		System.out.printf("������:%s\n", company);
		System.out.printf("����:%d����\n", price);
		System.out.printf("��Ż�:%s\n", provider);
		System.out.printf("����:%dg\n", weight);
		System.out.printf("����:%s\n", color);
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
