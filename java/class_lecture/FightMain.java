package Fight;

public class FightMain {

	public static void main(String[] args) {
		Warrior war = new Warrior("강한전사",200,110);
		Monster mon = new Monster("고블린",100,5);
		
		war.Attack(mon);//전사가 몬스터를 공격
		mon.Attack(war);//몬스터가 전사를 공격
	}
}
