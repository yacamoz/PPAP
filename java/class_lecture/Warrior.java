package Fight;

class Warrior {
	private String name;
	private int HP;
	private int damage;
	
	public Warrior() {
		name="기본전사";
		HP=100;
		damage=10;
	}
	public Warrior(String name,int HP,int damage) {
		this.name=name;
		this.HP=HP;
		this.damage=damage;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP=HP;
	}
	public String getName() {
		return name;
	}
	
	public void Attack(Monster mon) {
		//mon.hp=mon.hp-damage;
		mon.setHP(mon.getHP()-damage);//공격
		//현재 몬스터 HP를 가져와서 
		//그 값에 전사의 대미지를 뺀값을
		//몬스터 HP로 세팅한다.
		System.out.printf("%s가%s를 공격! 대미지:%d\n",name,mon.getName(),damage);
		System.out.printf("몬스터 HP:%d\n",mon.getHP());
	}
}
