package fight;

public class fightMain {

	public static void main(String[] args) {
		fight_warrior holy = new fight_warrior("�����",250,57);
		Monster troll = new Monster("Ʈ�ѷ�",300,50);
		
		while(true) {
		holy.Attack(troll);
		troll.Attack(holy);
		if(holy.getHP()==0) {
			System.out.printf("%s:�� �׷���? ��û�Ÿ��� ���� �ʳ�?", troll.getname());
			break;
		}
		else if(troll.getHP()==0) {
			System.out.printf("%s:�� �׷���? ��û�Ÿ��� ���� �ʳ�?", holy.getname());
			break;
		}
		}
	}

}
