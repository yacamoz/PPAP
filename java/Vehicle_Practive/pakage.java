package Vehicle_Practive;

class Vehicle{
	private String ID;
	private String name;
	private String provider;
	private double price;
	
	public Vehicle(){
		ID="000";
		name="기본차량";
		provider="기본제조사";
		price=0;
	}
	public Vehicle(String id, String name, String provider, double price) {
		this.ID=id;
		this.name=name;
		this.provider=provider;
		this.price=price;
	}
	public void introduce() {
		System.out.printf("ID:%s\n", ID);
		System.out.printf("Name:%s\n", name);
		System.out.printf("Provider:%s\n", provider);
		System.out.printf("price:%.1f\n", price);
	}
	
	public void upprice(double upprice) {
		this.price=upprice;
	}
	public String getID() {
		return ID;
	}
}

class Car extends Vehicle{
	private boolean navi;
	
	public Car() {
		navi=true;
	}
	public Car(String ID, String name, String provider, double price, boolean navi) {
		super(ID,name,provider,price);
		this.navi=navi;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("navigation:%b\n", navi);
	}
}

class truck extends Vehicle{

	private boolean navi;
	private double load;
	
	public truck() {
		navi=false;
		load = 0;
	}
	public truck(String ID, String name, String provider, double price, boolean navi, double load) {
		super(ID,name,provider,price);
		this.navi=navi;
		this.load=load;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("navigation:%b\n", navi);
		System.out.printf("load:%.1f\n", load);
	}
}

class bycicle extends Vehicle{ 
	private int number;
	
	public bycicle() {
		number=0;
	}
	public bycicle(String ID, String name, String provider, double price, int number) {
		super(ID,name,provider,price);
		this.number=number;
	}
	public void introduce() {
		super.introduce();
		System.out.printf("%d\n", number);
	}
}

