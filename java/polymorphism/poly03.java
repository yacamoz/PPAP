package polymorphism;

class Animal2{
	void breath() {
		System.out.println("breath");
	}
}

class Lion extends Animal2{
	public String toString() {
		return"lion";
	}
}
class Rabbit extends Animal2{
	public String toString() {
		return"rabbit";
	}
}
class Monkey extends Animal2{
	public String toString() {
		return"monkey";
	}
}

class zookeeper{
	void feed(Animal2 animal) {
		System.out.printf("%s에게 먹이주기\n", animal);
	}
}

public class poly03 {

	public static void main(String[] args) {
		Animal2 lion=new Lion();
		zookeeper james = new zookeeper();
		james.feed(lion);
		Animal2 rab=new Rabbit();
		Animal2 mon=new Monkey();
		james.feed(rab);
		james.feed(mon);
	}

}
