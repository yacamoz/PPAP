package Fight;

public class FightMain {

	public static void main(String[] args) {
		Warrior war = new Warrior("��������",200,110);
		Monster mon = new Monster("���",100,5);
		
		war.Attack(mon);//���簡 ���͸� ����
		mon.Attack(war);//���Ͱ� ���縦 ����
	}
}
