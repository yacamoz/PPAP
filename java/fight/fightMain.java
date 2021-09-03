package fight;

public class fightMain {

	public static void main(String[] args) {
		fight_warrior holy = new fight_warrior("성기사",250,57);
		Monster troll = new Monster("트롤로",300,50);
		
		while(true) {
		holy.Attack(troll);
		troll.Attack(holy);
		if(holy.getHP()==0) {
			System.out.printf("%s:왜 그러지? 휘청거리고 있지 않나?", troll.getname());
			break;
		}
		else if(troll.getHP()==0) {
			System.out.printf("%s:왜 그러지? 휘청거리고 있지 않나?", holy.getname());
			break;
		}
		}
	}

}
